package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1, "Book test");
		System.out.println(dp);
		Seller seller = new Seller(1, "Seller Teste", "selleremail@teste.com.br", new Date() , 2000.00, dp);
		System.out.println(seller);
	}
}
