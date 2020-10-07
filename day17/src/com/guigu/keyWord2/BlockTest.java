package com.guigu.keyWord2;
/**
 *类成员之四 代码块(或初始化块)
 *1.代码块的作用，用来初始化类，对象
 *2.代码块如果有修饰的话，只能使用static
 *3.分类：静态代码块 vs 非静态代码块
 *4. 静态代码块 带static关键字
 *   内部可以有输出语句
 *   随着类的加载而执行,而且只执行一次
 *   作用：初始化类的信息
 *   如果一个类中定义类对个静态代码块，则按照声明的先后顺序执行
 *   静态代码块的执行优先于非静态代码块执行
 *5.非静态代码块
 *   内部可以有输出语句
 *   随着对象的创建而执行
 *   每创建一个对象，就执行一次非静态代码块
 *   作用：可以在创建对象时，对对象的属性等进行初始化
 *   
 *对属性赋值的位置：
 *1.默认初始化
 *2.显示初始化
 *3.构造器中初始化
 *4.有了对象以后，可以通过“对象，属性”或“对象，方法”的方式，进行赋值
 *5.在代码块中赋值
 */
public class BlockTest {
   public static void main(String[] args) {
//	  String desc = Person.desc;
	  Person p1 = new Person();
	  Person p2 = new Person();

	  System.out.println(p1.age);
	  Person.info();
   }
}

class Person{
	String name;
	int age;
	static String desc = "我是一个人";
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//代码块
	
	static{
		System.out.println("hello,static block-1");
	}
	static{
		System.out.println("hello,static block-2");
	}
	//非静态代码块
	{
		System.out.println("hello,block");
		age = 1;
	}
	
	public void eat() {
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info() {
		System.out.println("我是一个快乐的人");
	}
}
