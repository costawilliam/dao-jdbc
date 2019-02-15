package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		System.out.println("Teste 01 - Seller findById:");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("");
		
		System.out.println("Teste 02 - Seller findByDepartment:");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("");
		System.out.println("Teste 03 - Seller findAll:");
		list = sellerDao.findAll();
		
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("");
		System.out.println("Teste 04 - Seller insert:");
		Seller newSeller = new Seller(null, "Greg 2", "Greg2@gmail.co,", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		
		System.out.println("");
		System.out.println("Teste 05 - Seller update:");
		seller = sellerDao.findById(1);
		seller.setName("Jonh Smith");
		sellerDao.update(seller);
	}

}
