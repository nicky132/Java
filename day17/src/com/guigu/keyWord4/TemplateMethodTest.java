package com.guigu.keyWord4;
/**
 *抽象类的应用，模版方法的设计模式
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
    	BankTemplateMethod btm = new DrawMoney();
    	btm.process();
    	BankTemplateMethod btm2 = new ManageMoney();
    	btm2.process();
	}
}

abstract class BankTemplateMethod{
	public void takeNumber() {
		System.out.println("取号排队");
	}
	public abstract void transact();//办理具体业务//钩子方法
	
	public void evalute() {
		System.out.println("反馈评分");
	}
	
	public final void process() {
		this.takeNumber();
		this.transact();//像个钩子，具体执行时，挂哪个子类，就执行哪个子类的实现代码
		this.evalute();
	}
}

class DrawMoney extends BankTemplateMethod{
	public void transact() {
		System.out.println("取钱");
	}
}

class ManageMoney extends BankTemplateMethod{
	public void transact() {
		System.out.println("我要理财，我有2000万美元");
	}
}