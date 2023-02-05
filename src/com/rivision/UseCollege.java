package com.rivision;

public class UseCollege {
public static void main(String[] args) {
	Course c  = new Course("BSC" , 100000 , true);
	
	Course d  = new Course("MSC" , 100000 , true);
	Course e  = new Course("BA" , 150000 , true);
	
	
	College a = new College("Panimalar" , "chennai", 1000 , c);
	College t = new College("JOSEPH" , "chennai", 1000 , d);
	College y = new College("JEPPIAR" , "chennai", 1000 , e);
	
	College k [] = {a,t,y};
	for(College x  : k) {
		if(x.getCourse().getIsArts()==true) {
			x.setName(x.getName().concat("College of arts and science"));
			
		}
		else {
			x.setName(x.getName().concat("College of Engineering"));
		}
	}
	for(int i =0 ; i<k.length ; i++) {
		System.out.println(k[i]);
	}
	
	College max  = k[0] ;
	for(int i = 0 ; i<k.length ; i++) {
		if(k[i].getCourse().getFees() >= max.getCourse().getFees()) {
			max = k[i];
		}
	}
		System.out.println(max);
	
}
}
