package br.edu.univas.vo;

public class ContNumbers implements Comparable<ContNumbers> {
	
	private String numero;
	private int contador;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getContador() {
		return contador;
	}
	public void setContador() {
		this.contador++;
	}
	@Override
	public int compareTo(ContNumbers o) {
		
		return (o.contador - this.contador);
	}
	
	

}
