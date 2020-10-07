package com.guigu.java;
/**
 *继承
 *1、体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有属性和方法
 *特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构，只有
 *因为封装性的影响，使得子类不能直接调用父类的结构而已，可以在子类公共类中调用
 *2、子类可以有自己的属性和方法，父类功能比较单一，子类可以在此基础上丰富些
 */
public class ExtendsTest {
   public static void main(String[] args) {
      Person p1 = new Person();
      p1.age = 1;
      p1.eat();
      
      Student s1 = new Student();
      s1.eat();
      s1.sleep();
      s1.name = "ss";
      
      Creature c = new Creature();
      System.out.println(c.toString());
   }
}
