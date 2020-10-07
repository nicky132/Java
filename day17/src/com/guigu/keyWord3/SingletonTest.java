package com.guigu.keyWord3;

public class SingletonTest {
   public static void main(String[] args) {
	   Bank bank1 = Bank.instance;
	   Bank bank2 = Bank.instance;
	   
//	   Bank bank3 = null;//如果Bank类中，实例造出来时没有加final，那么有可以被用户释放类，实例为null
//	   危险，所以加上final为好
	   
	   System.out.println(bank1 == bank2);
	   
   }
}

class Bank{
	private Bank() {
		
	}
	
	public static final Bank instance = new Bank();
}
