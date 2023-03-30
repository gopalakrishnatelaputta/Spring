package withoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client1 
{
	public static void main(String[] args) 
	{	
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfigClass1.class);
		
		Server ser=con.getBean("gk",Server.class);
		System.out.println(ser);
		ser.Study();
		//System.out.println(ser1);
		
		
	}
}
