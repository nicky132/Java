package com.guigu.equal;

public class MyDateTest {
   public static void main(String[] args) {
	   MyDate m1 = new MyDate(14,3,1976);
	   MyDate m2 = new MyDate(14,3,1976);
       
	   if(m1 == m2 ) {
		   System.out.println("m1==m2");
	   }else {
		   System.out.println("m1!=m2");
	   }
	   
	   if(m1.equals(m2)) {
		   System.out.println("m1 is equal to m2");
	   }else {
		   System.out.println("m1 is not equal to m2");
	   }
   }
}

class MyDate{
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
//	手写重写equals方法
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof MyDate) {
			MyDate mydate = (MyDate) obj;
			return this.day == mydate.day && this.month == mydate.month && 
					this.year == mydate.year;
		}
		
		return false;
	}
	
	//自动生成方式：右键选择Source再选择Generate hashCode() and equals()就能选择成功
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyDate other = (MyDate) obj;
//		if (day != other.day)
//			return false;
//		if (month != other.month)
//			return false;
//		if (year != other.year)
//			return false;
//		return true;
//	}
	
	
	
}