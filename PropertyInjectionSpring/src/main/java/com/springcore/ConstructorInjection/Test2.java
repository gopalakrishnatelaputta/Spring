package com.springcore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ConstructorInjection/ciConfig.xml");
		Person p=(Person) context.getBean("pq");
	
	System.out.println(p);
	
	}

}
