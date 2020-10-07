package com.guigu.team.service;

public class Data {
    static final int EMPLOYEE = 10;
    static final int PROGRAMMER = 11;
    static final int DESIGNER = 12;
    static final int ARCHITECT = 13;
    
    static final int PC = 10;
    static final int NOTEBOOK = 22;
    static final int PRINTER = 23;
    
    //Employee  :10 ,id ,name ,age ,salary
    //Programmer:11,id,name,age,salary
    //Designer  :12,id,name,age,salary,bonus
    //Architect :13,id,name,age,salary,bonus,stock
    public static final String[][] EMPLOYEES = {
    		{"10","1","马云","22","3000"},
    		{"13","2","马化腾","32","18000","15000","2000"},
    		{"11","3","李彦宏","23","7000"},
    		{"11","4","刘强东","24","7300"},
    		{"12","5","雷军","28","10000","5000"},
    		{"11","6","任志强","22","6800"},
    		{"12","7","柳传志","29","10800","5200"},
    		{"13","8","杨庆元","30","19800","15000","2500"},
    		{"12","9","史玉柱","26","9800","5500"},
    		{"11","10","丁磊","21","6600"},
    		{"11","11","张朝阳","25","7100"},
    		{"12","12","杨致远","27","9600","4800"}
    };
    //以下EQUIPMENTS数组与上面的EMPLOYEES一一对应
    //PC      :21,model,display
    //NoteBook:22,model,price
    //Printer :23,name,type
    public static final String[][] EQUIPMENTS = {
    		{},
    		{"22","联想T4","6000"},
    		{"21","戴尔","NEC17寸"},
    		{"21","戴尔","三星17寸"},
    		{"23","佳能2900","激光"},
    		{"21","华硕","三星17寸"},
    		{"21","华硕","三星17寸"},
    		{"23","安普生20k","针式"},
    		{"22","惠普m6","5800"},
    		{"21","戴尔","NEC17寸"},
    		{"21","华硕","三星17寸"},
    		{"22","惠普m6","5800"}
    };
}
