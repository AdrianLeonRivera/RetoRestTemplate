package com.bootcamp.circuitbreakerclient.rest;

public class CocheBuilder {
	
	private Coche c=new Coche();

	public CocheBuilder() 
	{
	}
	
	public CocheBuilder marca(String marca)
	{
		this.c.setMarca(marca);
		return this;
	}
	
	public CocheBuilder matricula(String apellidos)
	{
		this.c.setMatricula("4887GHJ");
		return this;
	}
	
	public CocheBuilder status(String status)
	{
		this.c.setStatus(status);
		return this;
	}
	
	public Coche build()
	{
		return c;
	}
}
