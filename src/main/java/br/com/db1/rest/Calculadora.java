package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
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
	
	
	@GET
	@Path("/somar/{valor1}/{valor2}")
	public Response somar(@PathParam("valor1") Double primeiroValor, @PathParam("valor2") Double segundoValor){
		this.resultado = primeiroValor + segundoValor;
		return Response.status(200).entity(resultado).build();
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
