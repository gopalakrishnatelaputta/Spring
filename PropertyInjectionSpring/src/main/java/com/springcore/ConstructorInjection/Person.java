package com.springcore.ConstructorInjection;

public class Person 
{
	private String name;
	private int Personid;
	
	public Person(String name,int PersonId)
	{
		this.name=name;
		this.Personid=PersonId;
		
	}

	@Override
	public String toString() {
		return this.name+" : "+this.Personid;
	}
	

}
