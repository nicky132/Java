package com.guigu.ever1;

public class BankTest {
   public static void main(String[] args) {
	  Bank bank = new Bank();
	  bank.addCustomer("stev", "jobs");
	  bank.getCustomer(0).setAccount(new Account(200));
	  bank.getCustomer(0).getAccount().withdraw(50);
	  double balance = bank.getCustomer(0).getAccount().getBalance();
	  System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "账户余额为：" + balance);
      System.out.println("************");
      bank.addCustomer("晴空", "万里");
      System.out.println("银行账户余额为：" + bank.getNumOfCustomers());
   }
}
