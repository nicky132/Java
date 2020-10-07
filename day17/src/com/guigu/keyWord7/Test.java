package com.guigu.keyWord7;

public class Test {

}

interface A{
	int x = 0;
}
class B{
	int x = 1;
}

class C extends B implements A{
	public void px() {
		//编译不通过，因为x是不明确的
//		System.out.println(x);//interface A和 class B同级，不知道用谁
		System.out.println(super.x);//1
		System.out.println(A.x);//0
	}
	public static void main(String[] args) {
		new C().px();
	}
}