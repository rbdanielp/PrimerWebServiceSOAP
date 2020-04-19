package edu.fing.tsig.negocio.beans;

import java.io.Serializable;

//@SessionScoped 
public class CalculadoraBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private int o,v1,v2;
	double r;
	
	
	public CalculadoraBean() {
		
	}


	public int getO() {
		return o;
	}


	public void setO(int o) {
		this.o = o;
	}


	public int getV1() {
		return v1;
	}


	public void setV1(int v1) {
		this.v1 = v1;
	}


	public int getV2() {
		return v2;
	}


	public void setV2(int v2) {
		this.v2 = v2;
	}


	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	

}
