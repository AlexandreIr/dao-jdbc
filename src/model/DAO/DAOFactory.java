package model.DAO;

import model.DAO.impl.SellerDAOJDBC;

public class DAOFactory {
	public static SellerDAO createSellerDAO() {
		return new SellerDAOJDBC();
	}
}
