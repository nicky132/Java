package com.guigu.test;
//包装类
/**
 *1、java提供类8种基本数据类型对应的包装类，使得基本数据类型的变了具有类的特性
 *2、掌握的，基本数据类型，包装类、String三者之间的相互转换
 */
import org.junit.Test;

public class WrapperTest {
	
	/**
	 *JDK 5.0新特性，自动装箱与自动拆箱
	 */
	@Test
	public void test3() {
		int num1 = 10;
		//基本数据类型 --》包装类的对象
		
		//正常来讲method里,按照下面method定义的方法是个Object类才能用，num1是个基本数据类型不能用
		//所以需要转换成包装类Integer才行，JDK 5.0以上会自动包装
		method(){
			
		}
		
		
		//自动装箱
		int num2 = 10;
		Integer in1 = num2;//自动装箱
		
		boolean b1 = true;
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱
		System.out.println(in1.toString());
		int num3 = in1;//自动拆箱
	}
	
	//基本数据类型、包装类 --》String类型，调用String重载的valueOf(Xxx xxx)
	@Test
	public void test() {
		int num1 = 10;
		//方式1:连接运算
		String str1 = num1 + "";
		//方式2:调用String的valueOf方法
		float f1 = 12.3f;
		String str2 = String,valueOf(f1);//12.3
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		
		System.out.println(str2);
		System.out.println(str3);
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
    //包装类 --》基本数据类型 调用包装类xxxValue()
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		Float f1 = new Float(12.3);
		f1.floatValue();
	}
	
	
	//基本数据类型 --》包装类，调用包装类的构造器
	@Test
	public void test1() {
		int num1 = 10;
		
//		System.out.println(num1.toString());
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
	}
	
	//String类型 --》基本数据类型、包装类，调用包装类的parseXxx(String s)
	@Test
	public void test4() {
		String str1 = "123";
		//错误的情况
//		int num1  = (int)str1;
//		Integer in1 = (Integer)str1;
		
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1);
		
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
	}
}
