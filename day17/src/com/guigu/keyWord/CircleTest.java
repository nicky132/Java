package com.guigu.keyWord;
//static关键字的应用
public class CircleTest {
   public static void main(String[] args) {
	  Circle c1 = new Circle();
	  Circle c2 = new Circle();
	  Circle c3 = new Circle(3.14);

	  
	  System.out.println("c1的id:" + c1.getId());
	  System.out.println("c2的id:" + c2.getId());
	  System.out.println("c3的id:" + c3.getId());
	  System.out.println("创建的圆的个数："+Circle.getTotal());
   }
}

class Circle{
	private double radius;
	private int id;
	
	private static int total;//多个对象共享
	private static int init = 1001;
	
	public double findArea() {
		return 3.14*radius*radius;
	}

	public Circle() {
		id = init ++;
		total++;
	}

	public Circle(double radius) {
//		this.radius = radius;
//		id = init ++;
//		total++;
		
//		或者
		this();
		this.radius = radius;
	}
	
	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}
	
}
