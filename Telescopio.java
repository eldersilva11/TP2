package br.edu.infnet.eldersilva.model.domain;

public class Telescopio {
	private int abertura;
	private int distancialFocal;
	private boolean isrefletor;
	private double magnitude ;
	
	public float relacaoFocal() { 
		
		if (abertura != 0 & distancialFocal != 0) { 
			return distancialFocal/abertura;	
			}
		else {
			return 0;
		}
	}
	
	
	public int getAbertura() {
		return abertura;
	}


	public void setAbertura(int abertura) {
		
		this.abertura = abertura;
		
		}
	


	public int getDistancialFocal() {
		return distancialFocal;
	}


	public void setDistancialFocal(int distancialFocal) {
		
			this.distancialFocal = distancialFocal;
			
	}


	public boolean getIsrefletor() {
		return isrefletor;
	}


	public void setIsrefletor(boolean isrefletor) {
		if (isrefletor == true || false) {
		this.isrefletor = isrefletor;
		}
	}


	public double getMagnitude() {
		return magnitude;
	}


	public void setMagnitude(double magnitude) {
		
		if (magnitude > 0) {
			this.magnitude = magnitude;
			}
			else {
				System.out.println("Magnitude: Invalida!");
			}
		
	}
  
}

