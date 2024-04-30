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
	}
}
