<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="Calculadora">
	<table style="width:100%">
		  <tr>
		    <td>Operación</td>
		    <td>		
		    	<SELECT NAME="operacion" MULTIPLE size=4>
					<OPTION value="1">Sumar</OPTION>
					<OPTION value="2">Restar</OPTION>
					<OPTION value="3">Multiplicar</OPTION>
					<OPTION value="4">Dividir</OPTION>
				</SELECT>
		  	</td>
		  </tr>
		  <tr>
		    <td>Valor-1</td>
		    <td><INPUT TYPE="TEXT" NAME="numero1"></td>
		  </tr>
		  <tr>
		    <td>Valor-2</td>
		    <td><INPUT TYPE="TEXT" NAME="numero2"></td>
		  </tr>
		  <tr>
		    <td><input type="submit" value="Enviar"></td>
		    <td></td>
		  </tr>
				
	</table> 
	</form>
</body>
</html>