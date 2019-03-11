package com.cg.ui;

import java.util.Scanner;

import com.cg.beans.Customer;
import com.cg.service.Service;
import com.cg.service.ServiceImpl;

public class mainUI {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Customer cust=new Customer();
		Service service=new ServiceImpl();
		System.out.println("1.Book Room \n 2.View Booking Status \n 3.Exit");
		System.out.println("enter the choice");
		int ch=sc.nextInt();
		switch(ch){
		case 1: 
			
			System.out.println("enter customer name");
			cust.setCustName(sc.next());
			System.out.println("enter customer mailid");
			cust.setEmail(sc.next());
			System.out.println("enter customer address");
			cust.setCustAddress(sc.next());
			System.out.println("enter mobile number");
			cust.setMobileno(sc.nextLong());
			System.out.println("enter the room type");
			cust.setRoomtype(sc.next());
			System.out.println("enter the room number");
			cust.setRoomNo(sc.nextInt());
			Customer customer=service.details(cust);
			System.out.println("your room has sucessfully booked");
			break;
		case 2: 
			System.out.println("enter customer id");
			int custid=sc.nextInt();
			if(custid==cust.getCustId()) {
				System.out.println("name of the customer"+cust.getCustName());
				System.out.println("Booking Status");
				System.out.println("room no"+cust.getRoomNo());
				System.out.println("room type"+cust.getRoomtype());
				
			}
			break;
		case 3:
			System.exit(0);
			break;
		case 4:
			System.out.println("wrong choice ");
				
				
				
			}
			
		}
	
		

	}


