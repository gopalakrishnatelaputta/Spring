package com.annotationAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/AutoWiring/configuration.xml");
	    Emp1 emp2=context.getBean("emp1",Emp1.class);
	    System.out.println(emp2);
	
	
	}

}

