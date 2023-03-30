package Springcore3.ConstrctorInjectionWithDependentObject;

public class Adress 
{
	private String city;
	private String state;
	private String country;
	
	
	public Adress() {
		super();
	
	}


	public Adress(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}


	@Override
	public String toString() {
		return "Adress [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
