package application;

import java.util.List;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.emtities.Department;
import model.emtities.Seller;

public class App {
	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		Seller sel = sellerDAO.findById(3);
		System.out.println(sel);
		System.out.println();
		Department dep = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		list = sellerDAO.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
		}
		System.out.println();
		/*Seller newSeller = new Seller(null, "Antonio", "antonio@gmail.com",Instant.ofEpochMilli(new Date().getTime()).atZone(ZoneId.systemDefault()).toLocalDate(),4500 ,dep);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted! new id = "+newSeller.getId());*/
		System.out.println();
		sellerDAO.deleteById(sellerDAO.findByName("Greg").getId());
	}
}
