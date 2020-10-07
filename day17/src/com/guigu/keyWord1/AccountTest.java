package com.guigu.keyWord1;
/**
 * 设计模式
 * 创建型模式，共5种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 * 结构型模式，共7种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式
 * 行为型模式，共11种：策略模式、模版方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式
 * 
 */
public class AccountTest {
   public static void main(String[] args) {
	   Account acct1  = new Account();
	   Account acct2  = new Account("qwerty",2000);

	   System.out.println(acct1);
	   System.out.println(acct2);
	   
	   System.out.println(acct1.getBalance());
	   System.out.println(acct2.getBalance());
   }
}
