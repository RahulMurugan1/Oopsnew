package com.rivision;

public class UseHdfc {
public static void main(String[] args) {
	HdfcBank b = new HdfcBank() ;
	System.out.println(b.electricCharges(300));
	System.out.println(b.goldloan(12));
	System.out.println(b.internet(500000));
	System.out.println(b.loan(20000, 1200000));
	System.out.println(b.location("chennai"));
	System.out.println(b.noOfRooms(4));
	
	
	
}
}
