package com.rivision;

public class PgHostel extends Hostel {
int noOfRoomates ; boolean isAc ;

public PgHostel (String name , String location , boolean isWifi , int rent ,int noOfRoomates , boolean isAc) {
	super(name , location , isWifi , rent);
	

	this.isAc= isAc ;
	this.noOfRoomates = noOfRoomates ;
	
}
public String toString() {
	
	return super.toString() +isAc +","+ noOfRoomates ;
}
public int findRent(int rent , boolean isWifi) {
	if(isWifi) {
		return rent + 1000 ;
	}
	else 
		return rent ;
}
public int findRent(int rent , boolean isWifi , int noOfRoomates) {
	if(isWifi==true && noOfRoomates <=3 ) {
		return rent + 1000 +1500 ;
	}
	else if(isWifi==true && noOfRoomates >3 ) {
		return rent +1000 ;
	}
	else 
		return rent ;


}





}
