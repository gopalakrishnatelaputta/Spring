package autowire.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire/autowireAnnotation/configuration.xml");
	    Employee emp2=context.getBean("emp1",Employee.class);
	    System.out.println(emp2);
	
	
	}

}

