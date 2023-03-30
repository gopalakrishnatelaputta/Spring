package com.Spring1Core.Spring1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 
@SuppressWarnings("deprecation")
public class Test 
{
	public static void main(String[] args) {
		Resource r=new ClassPathResource("Config.xml");
		BeanFactory f=new XmlBeanFactory(r);
		 
	}

}
