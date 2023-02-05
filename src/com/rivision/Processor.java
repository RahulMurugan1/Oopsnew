package com.rivision;

public class Processor {
private String name ;
private int price ;
private int gen ;
public Processor(String name , int price , int gen ) {
	this.name  = name ;
	this.gen = gen ; 
	this.price  = price ;
}
public String toString() {
	return name +"," + gen+"," + price ;
}
}
