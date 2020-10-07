package com.guigu.keyWord2;

class Root{
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	
	public Root() {
		super();
		System.out.println("Root的无参的构造器");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	
	public Mid() {
		super();
		System.out.println("Mid的无参的构造器");
	}
	
	public Mid(String msg) {
		this();
		System.out.println("Mid的带参构造器，其参数值：" + msg);
	}
}

class Leaf extends Mid{
	static {
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	
	public Leaf() {
		super();
		System.out.println("Leaf的构造器");
	}
}



public class LeafTest {
   public static void main(String[] args) {
	  new Leaf();
	  System.out.println("两次执行结果不一样");
	  new Leaf();//两次执行不一样
   }
}
