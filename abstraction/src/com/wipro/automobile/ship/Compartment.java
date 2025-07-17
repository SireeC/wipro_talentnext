package com.wipro.automobile.ship;

public class Compartment {
	int height;
	int width;
	int breadth;
	
	Compartment(int height, int width, int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	public int getbreadth() {
		return breadth;
	}
	public int volume() {
		return height*width*breadth;
	}
	public void Box(){
		System.out.println("Compartment Dimensions:");
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		System.out.println("Breadth: "+breadth);
		System.out.println("Volume: "+volume());
	}
}