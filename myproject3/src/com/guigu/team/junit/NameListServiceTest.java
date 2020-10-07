package com.guigu.team.junit;

import org.junit.Test;

import com.guigu.team.domin.Employee;
import com.guigu.team.service.NameListService;

/**
 *对NameListService类进行测试
 */
public class NameListServiceTest {
  @Test
  public void testGetAllEmployees() {
	  NameListService service = new NameListService();
	  Employee[] employees = service.getAllEmployees();
	  for(int i = 0;i < employees.length;i++) {
		  System.out.println(employees[i]);
	  }
  }
  @Test
  public void testGetEmployee() {
	  NameListService service = new NameListService();
	  int id = 1;
//	  id = 102;
	  try {
		Employee employee = service.getEmployee(id);
		System.out.println(employee);
	  } catch (Exception e) {
		System.out.println(e.getMessage());
	}
  }
}
