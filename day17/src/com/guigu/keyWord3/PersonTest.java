package com.guigu.keyWord3;
/**
 *抽象类的匿名子类
 *
 */
public class PersonTest {
    public static void main(String[] args) {
		method(new Student());//匿名对象
	    Worker worker = new Worker();
	    method1(worker);//非匿名类。非匿名对象
	    
	    method1(new Worker());//非匿名的类匿名的对象
	    
	    Person p = new Person() {
			@Override
			public void eat() {
            System.out.println("吃东西");			}
			@Override
			public void breath() {
            System.out.println("呼吸");
			}
	    }
	}
    
    public static void method1(Person p) {
    	p.eat();
    	p.walk();
    }
    
    public static void method(Student s) {
    	
    }
}

class Worker extends Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}
class Student extends Person{
	public Student(String name, int age) {
		super(name,age);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
}
