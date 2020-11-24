package application;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao deptDao = FactoryDao.createDepartmentDao();
		System.out.println("*** Testing the function of findById ***");
		Department deptment = deptDao.findById(8);
		System.out.println(deptment);
	}
}
