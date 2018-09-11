package br.com.db1.rest;

public class Calculadora{
	
	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;
	
	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}
	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
	
	public Double getPrimeiroValor() {
		return primeiroValor;
	}
	
	public Double getSegundoValor() {
		return segundoValor;
	}
	
	public void somar(){
		this.resultado = primeiroValor + segundoValor;
	}
	
	public void subtrair(){
		this.resultado = primeiroValor - segundoValor;
	}
	
	public void dividir(){
		this.resultado = primeiroValor/segundoValor;
	}
	
	public void multiplicar(){
		this.resultado = primeiroValor * segundoValor;
	}
	
	public Double exibirResultado(){
		return resultado;
	}
	
}
