package com.rivision;

public class UseLaptop {
public static void main(String[] args) {
	Battery b = new Battery(true , 50000 , 5000);
	Display d  = new Display("LED" , 2500 , true);
	Processor  p = new Processor("intel" , 5200  , 5);
	Laptop l = new Laptop("hp", 50000 ,p , d, b );
	System.out.println(l);
}
}
