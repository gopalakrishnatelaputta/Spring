package withoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="withoutXML")
public class JavaConfigClass1 
{
	@Bean
	public Student getStudent()
	{
		return new Student();
	}
	@Bean(name = {"con","temp","gk"})
	public Server getServer()
	{
		Server ser1=new Server(getStudent());
		System.out.println(ser1);
		return ser1;
		
	}
}
