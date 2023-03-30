package com.springcore.SpringExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/SpringExpressionLanguage/ExpressionLanguageconfig.xml");
		Demo demo=con.getBean("ob",Demo.class);
		System.out.println(demo);
	
	
	}

}
