package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cg.Utility.DataBase;
import com.cg.beans.Customer;

public class CustDaoImpl implements CustDao{

	public Customer details(Customer cust) {
		// TODO Auto-generated method stub
		DataBase db=new DataBase();
		Connection connection=db.myConnection();
		try {
			String sql="insert into customerdetails(custname,email,custAddress,mobileNo,roomtype,roomno) values(?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, cust.getCustName());
			ps.setString(2, cust.getEmail());
			ps.setString(3, cust.getCustAddress());
			ps.setLong(4, cust.getMobileno());
			ps.setString(5, cust.getRoomtype());
			ps.setInt(6, cust.getRoomNo());
			int i = ps.executeUpdate();
			if(i!=0) {
				PreparedStatement pst = connection.prepareStatement("update RoomsDetails set Status=? where RoomNo = ?");
				pst.setString(1, "Booked");
				pst.setInt(2, cust.getRoomNo());
				//pst.setString(2,cust.getRoomtype());
				
				int j = pst.executeUpdate();
				if(j == 1)
					cust.getCustId();
			}
			else {
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cust;
	


		
	}
	public Customer checkStatus()  {
		DataBase db=new DataBase();
		Connection connection=db.myConnection();
		try {
		PreparedStatement pst=db.connection().prepareStatement("select * from RoomsDetail where RoomNo="+"?");
		pst.setInt(1, custroomno);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			if(rs.getInt(1)==Customer.getRoomNo());
			System.out.println(rs.getString(3));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return Customer;

}
