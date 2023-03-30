package com.spirngcore.ref;

public class Ref 
{
	private int x;
	private RefB ob;
	public Ref(int x, RefB ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	
	public Ref() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public RefB getOb() {
		return ob;
	}
	public void setOb(RefB ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "Ref [x=" + x + ", ob=" + ob + ", getX()=" + getX() + ", getOb()=" + getOb() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
