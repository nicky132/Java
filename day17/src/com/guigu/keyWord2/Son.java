package com.guigu.keyWord2;

class Father{
	static {
		System.out.println("1111111");
	}
	{
		System.out.println("2222222");
	}
	
	public Father() {
		System.out.println("33333333");
	}
}

public class Son extends Father {
   static {
	   System.out.println("44444444");
   }
   {
	   System.out.println("5555555");
   }
   
   public Son() {
	   System.out.println("66666666");
   }
   
   public static void main(String[] args) {
	  System.out.println("77777777");
	  System.out.println("*************");
	  new Son();
	  System.out.println("**************");
	  
	  
	  new Son();
	  System.out.println("***************");
	  new Father();
   }
}
