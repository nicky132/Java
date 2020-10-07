package com.guigu.keyWord5;
/**
 *MyDate类包含：
 *private成员变量year，month，day：
 *toDateString()方法返回日期对用的字符串：xxxx年xx月xx日
 */
public class MyDate {
   private int year;
   private int month;
   private int day;
   
   
   public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

   public String toDateString() {
	   return "年" + year + "月" + month + "日" + day;
   }
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
