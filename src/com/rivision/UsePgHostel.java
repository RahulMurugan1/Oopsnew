package com.rivision;

public class UsePgHostel {
public static void main(String[] args) {
	PgHostel pg1 = new PgHostel("malar" , "chennai" , true , 5000 , 3 , true) ;
	
	PgHostel pg2 = new PgHostel("ninne" , "kerala" , false , 6000 , 6 , true) ;
	
	PgHostel pg3 = new PgHostel("kaanatha" , "kochin" , true , 7000 , 5 , false) ;
	
	
	PgHostel pg[] = {pg1,pg2,pg3};
	PgHostel min = pg[0] ;
	for(int i = 0 ; i<pg.length ; i++) {
		
	if(pg[i].rent<=min.rent) {
		min = pg[i] ;
	}
	}
	PgHostel max = pg[0] ;
	for(int i = 0 ; i<pg.length ; i++) {
		
	if(pg[i].rent>=max.rent) {
		max = pg[i] ;
	}
	}
	
	System.out.println(max);
    System.out.println(min);
    System.out.println(min.findRent(5000, false));
    System.out.println(min.findRent(7000, true, 4));
	
	
}
}
