package com.guigu.keyWord7;
/**
 *简单工厂设计模式
 */
public class SimpleCarFactory {
   public static void main(String[] args) {
	  Car a = CarFactory.getCar("奥迪");
	  a.run();
	  Car b = CarFactory.getCar("比亚迪");
	  b.run();
   }
}
interface Car{
	void run();
}

class Audi implements Car{
	public void run() {
		System.out.println("奥迪跑");
	}
}
class BYD implements Car{
	public void run() {
		System.out.println("比亚迪跑");
	}
}
class CarFactory{
   public static Car getCar(String type) {
	   if("奥迪".equals(type)) {
		   return new Audi();
	   }else if("比亚迪".equals(type)) {
		   return new BYD();
	   }else {
		   return null;
	   }
   }
}
