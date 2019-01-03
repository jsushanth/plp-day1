package com.cg.oicr.dao;

import java.io.IOException;
import java.sql.SQLException;

public interface IDao {
	public void Login(String username,String password) throws SQLException, IOException;
	public void Addcustomer();
	public void Registration();
	public void createClaim();
	public void viewclaim();
	public void viewAllclaim();

}
