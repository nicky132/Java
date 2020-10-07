package com.guigu.bean1;

import com.guigu.bean.Customer;

public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数据
    private int total = 0;//记录已保存客户对象的数量
    
    /**
     * 用来初始化customer数组的构造器
     */
    public CustomerList(int totalCustomer) {
    	customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer) {
    	if(total >= customers.length) {
    		return false;
    	}
    	customers[total++] = customer;
    	return true;
    }
    /**
     * 修改指定索引位置的客户信息
     */
    public boolean replaceCustomer(int index,Customer cust) {
    	if(index < 0 || index >= total){
    		return false;
    	}
    	customers[index] = cust;
    	return true;
    }
    /**
     * 删除指定索引位置的客户信息
     */
    public boolean deleteCustomer(int index) {
    	if(index < 0 || index >= total) {
    		return false;
    	}
    	for(int i = index;i < total - 1;i ++) {
    		customers[i] = customers[i + 1];
    	}
//    	customers[total - 1] = null;
//        total --；
//    	或者
    	customers[total--] = null;
    	return true;
    }
    /**
     * 获取所有的客户信息
     */
    public Customer[] getAllCustomers() {
    	Customer[] custs = new Customer[total];
    	for(int i = 0;i < total;i++) {
    		custs[i] = customers[i];
    	}
    	return custs;
    }
    /**
     * 获取指定索引位置的客户信息
     */
    public Customer getCustomer(int index) {
    	if(index < 0 || index >= total) {
    		return null;
    	}
    	return customers[index];
    }
    /**
     * 获取存储的客户数量
     */
    public int getTotal() {
    	return total;
//    	return customers.length;//错误
    }
}
