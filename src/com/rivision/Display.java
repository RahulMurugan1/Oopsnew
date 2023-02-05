package com.rivision;

public class Display {
	private String type  ;
	private int price ;
	private boolean isWarrenty ;
	
	
	public Display(String type , int price , boolean isWarrenty ) {
		this.type  = type ;
		this.price  = price ;
		this.isWarrenty = isWarrenty ;
		
	}
	public String toString() {
		return type+","+ price +","+isWarrenty ;
	}
	
	
	
	

}
