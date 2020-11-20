package application;

import java.util.Date;
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
		
		//System.out.println("\n *** Testing the function of insert ***");
		//Seller newSeller = new Seller(null, "User Insert", "userinsert@teste.com", new Date(), 2333.50, department);
		//sellerDao.insert(newSeller);
		//System.out.println("New Insert! User Id " + newSeller.getId());
		
		System.out.println("\n *** Testing the function of update ***");
		Seller selectSeller = sellerDao.findById(10);
		selectSeller.setName("UpdatedName");
		sellerDao.update(selectSeller);
		System.out.println("Seller Updated!");
	}
}