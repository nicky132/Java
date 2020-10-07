package com.guigu.keyWord2;
/**
 * 
 *final:最终的
 *1.final 可以用来修饰的结构：类、方法、变量
 *2.final 用来修饰一个类:此类不能被其他类所继承
 *        比如：String类、System类、StringBuffer类
 *3.final 用来修饰方法，表明此方法不可以被重写
 *        比如：Object类中getClass()
 *4.final 用来修饰变量，就称为一个常量
 *        4.1 final修饰属性，可以考虑赋值的位置有：显式初始化,代码块中初始化
 *        4.2 final修饰局部变量，
 *             尤其是使用final修饰形参时，表明此形参是一个常量。
 *             当我们调用此方法时，给常量形参赋一个实参，一旦赋值以后，
 *             就只能在方法体内使用此形参，但不能进行重新赋值。
 * static final 用来修饰属性，全局常量
 */
public class FinalTest {
//	  final int LEFT;//定义一个常量
	
//    final int width = 10;
//    public void doWidth() {
//    	width = 20;
//    }
//	{
//		width = 30
//	}
//    width 变量被重新修改成20时，报错，因为width被定义了final类型
	
//	public void show() {
//		final int NUM = 10;//常量
////		NUM += 20;//不能再次赋值，因为定义了final类型
//	}

	public void show(final int num) {
//		num = 20;//形参已经定义成了final类型，不能再次赋值
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		int num = 10;
		FinalTest test = new FinalTest();
		test.show(10);
	}
}
final class FinalA{
	
}
//class B extends FinalA{
//	
//}
// B不能继承FinalA类，因为FinalA是final类型的,继承就会报错


//class C extends String{
//	
//}
// C 不能继承String类，继承就会报错


//class AA{
//	public final void show() {
//		
//	}
//}
//class BB extends AA{
//	public void show() {
//		
//	}
//}
//BB不能继承AA，BB会报错，因为AA方法被定义成了final类型



//测试题
////排错
//public class Something{
//	public int addOne(final int x) {
////		return ++x; //不行，会报错，因为定义了final类型
////		return x + 1;//这个不会报错，因为x之后再次加1
//	}
//}
//
//public class Something{
//	public static void main(String[] args) {
//		Other o = new Other();
//		new Something().addOne(o);
//	}
//	
//	public void addOne(final Other o ) {
////		o = new Other();
//		o.i++;//对的，因为只要o这个对象不要变就没问题
//	}
//}
//class Other{
//	public int i;
//}
