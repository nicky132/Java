package com.guigu.keyWord7;
/**
 *无工厂模式
 */
public class noCarFactory {
   public static void main(String[] args) {
	  Car a = new Audi();
	  Car b = new BYD();
	  a.run();
	  b.run();
   }
}
interface Car{
	void run();
}

class Audi implements Car {
	public void run() {
		System.out.println("奥迪跑");
	}
}

class BYD implements Car{
	public void run() {
		System.out.println("比亚迪跑");
	}
}