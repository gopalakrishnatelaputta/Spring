package com.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/AutoWiring/configuration.xml");
	    Emp emp2=context.getBean("emp1",Emp.class);
	    System.out.println(emp2);
	
	
	}

}
