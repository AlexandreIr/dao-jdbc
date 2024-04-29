package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.emtities.Seller;

public class App {
	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		Seller sel = sellerDAO.findById(3);
		System.out.println(sel);
	}
}
