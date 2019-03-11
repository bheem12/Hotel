package com.cg.service;

import com.cg.beans.Customer;
import com.cg.dao.CustDao;
import com.cg.dao.CustDaoImpl;

public class ServiceImpl implements Service {

	public Customer details(Customer cust) {
		// TODO Auto-generated method stub
		CustDao Dao=new CustDaoImpl();
		Dao.details(cust);
		Customer customer=Dao.details(cust);
		return customer;
	}

}
