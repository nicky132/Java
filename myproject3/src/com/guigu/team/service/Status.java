package com.guigu.team.service;
/**
 *员工一共有三种状态
 */
public class Status {
   private final String NAME;
   private Status(String name) {
	   this.NAME = name;
   }
   String getNAME() {
	   return NAME;
   }
   public static final Status FREE = new Status("FREE");
   static final Status BUSY = new Status("BUSY");
   private static final Status VOCATION = new Status("VOCATION");
   @Override
   public String toString() {
	   return NAME;
   }
}
