package javaconfig.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client 
{
	public static void main(String[] args) 
	{	
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfigClass.class);
		
		Student demo=con.getBean("firststudent",Student.class);
		System.out.println(demo);
		demo.study();
		
		
	}

}
