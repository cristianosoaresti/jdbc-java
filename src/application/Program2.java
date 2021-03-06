package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao deptDao = FactoryDao.createDepartmentDao();
		//
		System.out.println("*** Testing the function of findById ***");
		Department department = deptDao.findById(7);
		System.out.println(department);
		//
		System.out.println("\n *** Testing the function of update ***");
		department.setName("Sales");
		deptDao.update(department);
		//
		System.out.println("\n *** Testing the function of delete ***");
		deptDao.deleteById(9);
		
		//System.out.println("\n*** Testing the function of insert ***");
		//Department newDepartment = new Department(null, "Technology");
		//deptDao.insert(newDepartment);
		//System.out.println("Department inserted. ID: " + newDepartment.getId());
		
		System.out.println("\n*** Testing the function findAll ***");
		List<Department> deptmentList = new ArrayList<>(); 
		deptmentList = deptDao.findAll();
		for (Department dept : deptmentList) {
			System.out.println(dept);
		}
	}
}
