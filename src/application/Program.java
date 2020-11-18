package application;

import java.util.List;

import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = FactoryDao.createSellerDao();

		System.out.println("*** Testing the function findById ***");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n *** Testing the function findAllByDepartment ***");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findAllByDepartment(department);
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("\n *** Testing the function findAll ***");
		sellerList = sellerDao.findAll();
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
	}
}
