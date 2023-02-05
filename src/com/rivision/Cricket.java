package com.rivision;

import java.util.Scanner;


public class Cricket {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int b = 0 ;
		int a = 0;
		System.out.println("Bowl");
		System.out.println("0 = dot ; 1 = run");
	for(int i = 0; i<3; i++) {
		
	 a  = s.nextInt();
		if(a==0) {
		
		}
		else {
			b++ ;
			i = -1 ;
		}
	}
	System.out.println("Batsman is out - 3 dots");
		System.out.println("Scored Runs "+b);
		
	}     

}
