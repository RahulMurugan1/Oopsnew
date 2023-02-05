package com.rivision;

public class College {
	private String name ;
	private String location ;
	private int noOfStudents ;
	private Course course ;
	
	public void setName(String name ) {
		this.name  = name ;
	}
	public String getName() {
		return name ;
	}
	public void setLocation(String location) {
		this.location = location ;
	}
	public String getLocation() {
		return location ;
	}
	public void setNoOfStudents(int no) {
		noOfStudents = no ;
	}
	public int getNoOfStudents() {
		return noOfStudents ;
	}
	public void setCourse(Course course) {
		this.course = course ;
	}
	public Course getCourse() {
		return course ;
	}
	
	public College(String name ,String location , int noOfStudents , Course course ) {
		this.name  = name ;
		this.location = location ;
		this.noOfStudents = noOfStudents ;
		this.course = course ;
	
	}
	public String toString() {
		return name + location+noOfStudents+course ;
	}
	
	

}
