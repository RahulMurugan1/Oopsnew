package com.rivision;

public class Course {
	private String name ;
	private int fees ;
	private boolean isArts ;
	
	
	public void setBrand(String n) {
	name  = n ;
	}
	public String getBrand() {
		return name ;
	}
	public void setFees(int fees) {
		this.fees = fees ;
	}
	public int getFees() {
		return fees ;
	}
	public void setIsArts(boolean isArts) {
		this.isArts = isArts ;
		
	}
	public boolean getIsArts() {
		return isArts ;
	}
	public Course(String n , int fees , boolean isArts) {
		name  = n;
		this.fees = fees ;
		this.isArts = isArts ;
		
	}
	public String toString() {
		return name +" "+ fees+" "+ isArts ;
	}

}
