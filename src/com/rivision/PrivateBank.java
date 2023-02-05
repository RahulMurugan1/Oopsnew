package com.rivision;

public  abstract class PrivateBank implements Bank1 , Building {
	public abstract int goldloan(int grams) ;

	@Override
	public int noOfRooms(int rooms) {
		
		return rooms;
	}

	@Override
	public String location(String location) {
		
		return location ;
	}

	@Override
	public String loan(int salary, int propertyValue) {
		int loan1  = salary*10 + propertyValue/2  ;
		return "loan amount is "+loan1;
	}

	@Override
	public int internet(int principleAmount) {
		
		return principleAmount*20 /100;
	}

	@Override
	public int electricCharges(int unit) {
		
		return unit*8 ;
	}

	
	

}
