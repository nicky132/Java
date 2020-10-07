package com.guigu.test;

import java.util.Scanner;
import java.util.Vector;

/**
 *利用Vector代替数组处理，从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级
 *提示，数组一旦创建，长度就固定不变，所以在创建数组签就需要知道它的长度
 *而向量类java.util.vector可以根据需要动态伸缩
 *
 *创建vector对象，vector v = new vector()；
 *给向量中的元素，Object obj = v.elemenAt(0);
 *注意第一个元素的下标是0，返回值是Object类型的
 *计算向量的长度：v.size();
 *若与最高分相差10分内，A等；20分，B等
 *   30分内：C等；其他，D等
 *
 */
public class WrapperScoreTest {
    public static void main(String[] args) {
		//1.实例化Scanner，用于从键盘获取学生成绩
    	Scanner scan = new Scanner(System.in);
    	//2.创建vector对象，vector v = new vector（）相当于原来的数组
    	Vector v = new Vector();
    	//3.通过for(;;)或while(true)方式，给vector中添加数组，v.addElement(Object obj)
    	int maxScore = 0;
    	for(;;) {
    		System.out.println("请输入学生成绩（以负数代表输入结束）");
    		int score = scan.nextInt();
    		//3.2当输入是负数时，跳出循环
            if(score < 0) {
            	break;
            }
            if(score > 100) {
            	System.out.println("输入的数据非法，请重新输入");
            	continue;
            }
        	//3.1添加操作，v.addElement(Object obj)
    		//JDK 5.0 之前
//    		Integer inScore = new Integer(score);
//    		v.addElement(inScore);//多态
    		
            
            //JDK 5.0之后
    		v.addElement(score);//多态
        	//4.获取学生成绩的最大值
            if(maxScore < score) {
            	maxScore = score;
            }
    	}
    	//5.遍历vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级
	    char level;
    	for(int i = 0;i <v.size();i++) {
	    	Object obj = v.elementAt(i);
//	    	//jdk 5.0之前
//    		Integer inScore = (Integer) obj;
//            int score = inScore.intValue();
//            
//            if(maxScore - score <= 10) {
//            	level = 'A';
//            }else if(maxScore - score <= 20) {
//            	level = 'B';
//            }else if(maxScore - score <= 30) {
//            	level = 'C';
//            }else {
//            	level = 'D';
//            }
          //jdk 5.0之后
            int score = (int)obj;
            if(maxScore - score <= 10) {
            	level = 'A';
            }else if(maxScore - score <= 20) {
            	level = 'B';
            }else if(maxScore - score <= 30) {
            	level = 'C';
            }else {
            	level = 'D';
            }
            
            System.out.println("student-" + i + "score is" + 
            score + ",level is" + level);
	    }
    }
}
