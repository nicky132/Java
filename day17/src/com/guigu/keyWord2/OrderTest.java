package com.guigu.keyWord2;
/**
 *对属性可以赋值的位置
 *1.默认初始化
 *2.显式初始化/5.在代码块中赋值
 *3.构造器中初始化
 *4.有了对象以后，可以通过“对象，属性”或“对象，方法”的方式，进行赋值
 *
 *执行的先后顺序：1 - 2 / 5 - 3 - 4
 *
 */
public class OrderTest {
   public static void main(String[] args) {
	   OrderAnther order = new OrderAnther();
	   System.out.println(order.orderId);
   }
}
 class OrderAnther{
	 {
		 orderId = 4;
	 }
	 int orderId = 3;
 }
