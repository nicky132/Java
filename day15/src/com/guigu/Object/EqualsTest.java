package com.guigu.Object;

/**
 *像String、Date、File、包装类等都重写了Object类中的equals()方法，重写以后，比较的不是两个
 *引用的地址是否相同，而是比较两个对象的“实体内容”是否相同
 *
 */
public class EqualsTest {
    public static void main(String[] args) {
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == i);//true
		System.out.println(i == d);//true
		
		boolean b = true;
//		System.out.println(i == b);
		
		char c = 10;
		System.out.println(i == c); //true
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);
		
		//引用数据类型
//		Customer cust1 = new Customer("Tom",21);
//		Customer cust2 = new Customer("Tom",21);
//        System.out.println(cust1 == cust2); //false
        
//        String str1 = new String("guigu");
//        String str2 = new String("guigu");
//        System.out.println(str1 == str2);//false
//		  System.out.println(str1.equals(str2));
	
////    重写：两个对象的实体内容（age和name）是否相同
//      @override
//      public boolean equals(Object obj) {
//    	  if(this == obj) {
//    		  return true;
//    	  }//地址相同就一样
//    	  if(obj instanceof Customer) {
//    		  Customer cust = (Customer)obj;
//    		  return this.age == cust.age && this.name.equals(cust.name);
//    	  }else {
//    		  return false;
//    	  }
//      }
    }
}
