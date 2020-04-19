package edu.fing.tsig.servlets;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.fing.tsig.negocio.log.Loguear;
import edu.fing.tsig.negocio.Fachada;
import edu.fing.tsig.negocio.beans.*;




@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger =  Logger.getLogger("Calculadora.class");

    public Calculadora() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Loguear.logTitulo("DO GET");
		printParametros(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Loguear.logTitulo("DO POST");
		printParametros(request, response);
		//doGet(request, response);
		CalculadoraBean calBean = new CalculadoraBean();
		calBean.setO(Integer.parseInt(request.getParameter("operacion")));
		calBean.setV1(Integer.parseInt(request.getParameter("numero1")));
		calBean.setV2(Integer.parseInt(request.getParameter("numero2")));
		
		String a = ""+Fachada.ProcesarOperacion(calBean);
		
		response.getWriter().append("Resultado: ").append(a.toString());
	}
	
	protected void printParametros(HttpServletRequest request, HttpServletResponse response)
	{
		logger.info("operacion : " + request.getParameter("operacion"));
		logger.info("numero1   : " + request.getParameter("numero1"));
		logger.info("numero2   : " + request.getParameter("numero2"));	 
		
		
	}

}
