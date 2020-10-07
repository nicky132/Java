package com.guigu.keyWord7;
/**
 *工厂设计模式
 */
public class carTactory {
   public static void main(String[] args) {
	  Car a = new AudiFactory().getCar();
	  Car b = new BydFactory().getCar();
	  a.run();
	  b.run();
   }
}

class Car{
	void run();
}

class Audi implements Car{
	public void run() {
		System.out.println("Audi跑");
	}
}

class BYD implements Car{
	public void run() {
		System.out.println("比亚迪跑");
	}
}
//工厂接口
interface Factory{
	Car getCar();
}
//两个工厂类
class AudiFactory implements Factory{
	public Audi getCar() {
		return new Audi();
	}
}

class BydFactory implements Factory{
	public BYD getCar() {
		return new BYD();
	}
}