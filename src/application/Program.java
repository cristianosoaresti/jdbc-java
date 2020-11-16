package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1, "Book test");
		System.out.println(dp.toString());
	}
}
