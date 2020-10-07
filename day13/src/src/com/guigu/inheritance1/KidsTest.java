package src.com.guigu.inheritance1;

public class KidsTest {
    public static void main(String[] args) {
		Kids someKid = new Kids();
		someKid.setSalary(200);
		someKid.setAge(100);
		System.out.println(someKid.printAge());
		
		
//		向下转型指的是父类向下强转，向上转型指的是多态
//		Person p2 = new Man();
//		Man m1 = (Man) p2;
//		这个上面的操作p2就是向下转型，这种情况有转换风险，使用时候要注意;就跟基础数据类型强转一样（int），有风险，这样会损失精度
	    
//		引用数据类型强转后，需要这么用一下判断再在里面具体写逻辑
//		总结：索引使用强转，那么前提就是new出来的一定是个子类，不然如果是父类的话，编译过运行不会过，报错，因为父类不能找到本该子类的方法或属性
		if(p2 instanceof Woman) {
	    	Woman w1 = (Woman) p2;
	    	w1.goShopping();
	    	System.out.println("Woman");
	    }
	    if(p2 instanceof Man) {
	    	Man m2 = (Man) p2;
	    	m2.earnMoney();
	    	System.out.println("Man");
	    }
    }
}
