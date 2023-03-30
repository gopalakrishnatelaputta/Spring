package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp 
{
	private String EmpName;
	private List<String>phones;
	private Set <String>addresses;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	private Map<String ,String>course;
	public Emp(String empName, List<String> phones, Set<String> addresses, Map<String, String> course) {
		super();
		EmpName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
