package Springcore3.ConstrctorInjectionWithDependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext aa=new ClassPathXmlApplicationContext("applicationContextxml.xml");
		//Resource r=new ClassPathResource();
		//BeanFactory factory=new XmlBeanFactory(r);
		Employee s=(Employee) aa.getBean("e");
		s.show();
	}
}
