package com.guigu.team.view;

import com.guigu.team.domin.Employee;
import com.guigu.team.service.NameListService;
import com.guigu.team.service.TeamService;

public class TeamView {
   private NameListService listSvc = new NameListService();
   private TeamService teamSvc = new TeamService();
   
   public void enterMainMenu() {
	   boolean loopFlag = true;
       while(loopFlag) {
    	   listAllEmployees();
    	   System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
           char menu = TSUtility.readMenuSelection();
           switch(menu) {
           case '1':
        	   getTeam();
        	   break;
           case '2':
        	   addMember();
        	   break;
           case '3':
        	   deleteMember();
        	   break;
           case '4':
        	   System.out.println("是否要退出(Y/N).");
        	   char isExit = TSUtility.readConfirmSelection();
        	   if(isExit == 'Y') {
        		   loopFlag = false;
        	   }
        	   break;
           }
       }
   }
   /**
    *显示所有的员工信息
    */
   private void listAllEmployees() {
//	   System.out.println("显示所有员工信息");
	   System.out.println("------------开发团队调度软件------------");
       Employee[] employees = listSvc.getAllEmployees();
       if(employees == null || employees.length == 0) {
    	   System.out.println("公司里没有任何员工信息！");
       }else {
    	   System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
    	   for(int i = 0;i < employees.length;i++) {
    		   System.out.println(employees[i]);
    	   }
       }
	   System.out.println("-------------------------------------------");
   }
   private void getTeam() {
	   System.out.println("查看开发团队");
   }
   private void addMember() {
	   System.out.println("添加团队成员");
   }
   private void deleteMember() {
	   System.out.println("删除团队成员");
   }
   
   public static void main(String[] args) {
	  TeamView view = new TeamView();
	  view.enterMainMenu();
   }
}
