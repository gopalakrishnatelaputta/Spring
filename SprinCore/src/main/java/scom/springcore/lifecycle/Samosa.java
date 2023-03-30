package scom.springcore.lifecycle;

public class Samosa 
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void init()
	{
		System.out.println("Inside init() method");
	}
	public void destroy()
	{
		System.out.println("Inside destry() method");
	}
	
	

}
