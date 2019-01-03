package com.cg.oicr.dao;



import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.oicr.util.DBconnection;

public class DaoImpl implements IDao {

	@Override
	public void Login(String username, String password) throws SQLException, IOException {
		String uname=null;
		String pwd=null;
		DBconnection db=new DBconnection();
		Connection connection=db.getConnection();
		Statement stm=connection.createStatement();
		ResultSet rs=stm.executeQuery(" select username,password from login_details ");
		while(rs.next()){
			uname=rs.getString(1);
			pwd=rs.getString(2);
			if(username==uname&&password==pwd){
				uname=username;
				pwd=password;
				break;
			}
			uname=null;
			pwd=null;
		}
		PreparedStatement pst=connection.prepareStatement("select rolecode from users where username=?,password=?");
		pst.setString(1,uname);
		pst.setString(2,pwd);
		
		
	}

	@Override
	public void Addcustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Registration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createClaim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewclaim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllclaim() {
		// TODO Auto-generated method stub
		
	}

}
