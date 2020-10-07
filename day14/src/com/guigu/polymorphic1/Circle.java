package com.guigu.polymorphic1;

public class Circle extends GeometricObject {

	private double radius;
	
	public Circle(double radius,String color, double weight) {
		super(color, weight);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return 3.14*radius*radius;
	}
}
