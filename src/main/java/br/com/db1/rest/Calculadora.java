package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class Calculadora{
	
	private Integer resultado;
	
	@GET
	@Path("/somar/{valor1}/{valor2}")
	public Response somar(@PathParam("valor1") Integer primeiroValor, @PathParam("valor2") Integer segundoValor){
		this.resultado = primeiroValor + segundoValor;
		return Response.status(200).entity(resultado).build();
	}
	
	@GET
	@Path("/subtrair/{valor1}/{valor2}")
	public Response subtrair(@PathParam("valor1") Integer primeiroValor, @PathParam("valor2") Integer segundoValor){
			this.resultado = primeiroValor - segundoValor;
			return Response.status(200).entity(resultado).build();
	}
	
	public void dividir(){
	//	this.resultado = primeiroValor/resultado;
	}
	
	public void multiplicar(){
	//	this.resultado = primeiroValor * resultado;
	}
	
}
