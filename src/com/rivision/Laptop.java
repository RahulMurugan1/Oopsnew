package com.rivision;

public class Laptop {
private String brand ;
private int price ;
private Processor processor ;
private Display display ;
private Battery battery ;
public Laptop(String brand , int price , Processor processor , Display display , Battery battery) {
	this.brand  = brand ;
	this.price  = price ;
	this.processor  = processor ;
	this.battery = battery ;
	this.display = display ;
}
public String toString() {
	return brand +","+ price +","+ processor +","+battery+","+display;
}
}
