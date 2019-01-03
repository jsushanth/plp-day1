package com.cg.oicr.service;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.oicr.dao.DaoImpl;
import com.cg.oicr.dao.IDao;

public class ServiceImpl implements IService {
	IDao d=new DaoImpl();

	@Override
	public void Login(String username,String password) throws SQLException, IOException {
		d.Login( username, password);
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
