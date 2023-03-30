package Springcore3.ConstrctorInjectionWithDependentObject;

public class Employee 
{
	private int id;
	private String name;
	private Adress address;
	
	public Employee()
	{
		super();
		System.out.println("default cons");
	}

	public Employee(int id, String name, Adress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void show()
	{
		System.out.println(id+"  "+name);
		System.out.println(address.toString());
	}

}
