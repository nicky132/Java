package com.guigu.test;

public class WrapperInterview {
    public void test() {
    	//面试第一题
    	Object o1 = true?new Integer(1): new Double(2.0);
    	System.out.println(o1);//1.0,new Integer(1) 和 new Double(2.0)被提升的时候要求统一类型
    	
    	//面试第二题
    	Object o2;
    	if(true)
    		o2 = new Integer(1);
    	else
    		o2 = new Double(2.0);
    	System.out.println(o2);//1
    	
    	//面试第三题
    	Integer i = new Integer(1);
    	Integer j = new Integer(1);
    	System.out.println(i == j);//false
    	//Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[].
    	//保存了-128-127范围内的整数，如果我们使用自动装箱的方式，给Integer赋值的范围在
    	//-128-127范围内时，可以直接使用数值中的元素，不会在去new了，目的，提高效率
    	Integer m = 1;
    	Integer n = 1;
    	System.out.println(m == n);//true
    	
    	Integer x = 128;//相当于new了一个Integer对象
    	Integer y = 128;//相当于new了一个Integer对象
    	System.out.println(x == y);//false
    }
}
