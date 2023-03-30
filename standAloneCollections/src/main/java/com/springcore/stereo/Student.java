package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student 
{
	@Value("Gopala Krishna Telaputta")
	private String Studentname;
	@Value("Hyderabad")
	private String city;
	@Value("#{Temp}")
	private List<String>address;
	
	
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student5 [Studentname=" + Studentname + ", city=" + city + "]";
	}
	
	

}
