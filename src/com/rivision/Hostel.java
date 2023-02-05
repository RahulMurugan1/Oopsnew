package com.rivision;

public class Hostel {
 String name ;
 String location ;
 boolean isWifi ;
 int rent ;


public Hostel(String name , String location , boolean isWifi , int rent ) {
	this.name = name ;
	this.location = location  ;
	
	this.isWifi = isWifi ;
	this.rent  = rent  ;
}
public String toString() {
	return name +","+location +","+isWifi +","+ rent ;
}
public int findRent(int rent , boolean isWifi) {
	if(isWifi) {
		return rent+2000 ;
	}
	else 
		return rent; 
}


}
