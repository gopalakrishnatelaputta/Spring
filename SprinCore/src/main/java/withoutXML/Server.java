package withoutXML;

import org.springframework.stereotype.Component;

//@Component("first")
public class Server 
{
	private Student student;
	
	
	public Server(Student student) {
		super();
		this.student = student;
	}
	


	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public void Study()
	
	{
		this.student.display();
		System.out.println("Don't disturb him ,He is Studying  ... ");
	}

}
