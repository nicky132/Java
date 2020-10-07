package com.guigu.poy;
//多态性的好处，声明的时候可以声明成动物，具体应用的时候给它传值个具体的猫、狗实例
//多态只适用于方法，编译看左边，运行看右边，不试用于属性（编译和运行都看左边），看哪边指的是等号赋值的左右边

public class AnimalTest {
   public static void main(String[] args) {
	   AnimalTest test = new AnimalTest();
	   test.func(new Dog());
	   test.func(new Cat());
   }
   public void func(Animal animal) {
	   animal.eat();
	   animal.shout();
   }
}


class Animal{
	public void eat() {
		System.out.println("动物进食");
	}
	public void shout() {
		System.out.println("动物叫");
	}
}


class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃骨头");
	}
	public void shout() {
		System.out.println("汪汪汪");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void shout() {
		System.out.println("喵喵喵");
	}
}