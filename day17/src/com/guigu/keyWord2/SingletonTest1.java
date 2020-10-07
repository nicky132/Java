package com.guigu.keyWord2;
/**
 *单例设计模式
 *概念：所谓类的单例设计模式，就是采用一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 *实现：1. 饿汉式
 *     2. 懒汉式
 *区分：饿汉式和懒汉式
 *     饿汉式：坏处，对象加载时间过长
 *            好处，懒汉式是线程安全的
 *            两个线程同时去取5000块钱时，先去判断余额有没有5000块钱，有的话再去取，当第一个走进有5000块钱判断时，
 *            短时间内，另外一个人也进了这个判断，结果造成两个人都取走了5000块钱
 *     懒汉式：好处，延迟对象的创建
 *            坏处，线程不安全的 --》多线程内容时候再更修改
 *单例模式优点：
 *     由于单例模式只生成一个实例，减少了系统性能开销，当一个对象的产生需要比较多的资源时，如读取配置、产生其他依赖对象时，
 *     则可以通过在应用启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。例如：Runtime.java就是个单例模式
 *单例模式应用场景：
 *     网站计数器，一般也是单例模式实现，否则难以同步。
 *     
 *     应用程序的日志应用，一般都使用单例模式实现，这一般是由于共享的日志文件一直处于打开状态，因为只能有一个实例去操作，
 *     否则内容不好追加。 
 *     
 *     数据库连接池的设计，一般也是采用单例模式，因为数据库连接是一种数据库资源。
 *     项目中，读取配置文件的类，一般也只有一个对象。没有必要每次使用配置文件数据，都生成一个对象去读取。
 *     
 *     Application也是单例的典型应用
 *     Windows的Task Manager(任务管理)就是很典型的单例模式
 *     Windows的Recycle Bin(回收站)也是典型的单例应用。在整个系统运行过程中，回收站一直维护者仅有一个实例
 */
public class SingletonTest1 {
	public static void main(String[] args) {
		//不是单例设计模式
//		Bank bank1 = new Bank();
//		Bank bank2 = new Bank();
		//单例模式
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();	
		System.out.println(bank1 == bank2);
	}
}
//饿汉式
class Bank{
	//1私有化类的构造器
	private Bank() {
		
	}
	//2内部创建类的对象
	private static Bank instance = new Bank();
	
	//3提供公共方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
	
}
