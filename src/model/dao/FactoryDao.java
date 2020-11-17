package model.dao;

import java.sql.Connection;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class FactoryDao {
	
	public static Connection conn;
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
