package model.DAO;

import db.DB;
import model.DAO.impl.DepartmentDAOJDBC;
import model.DAO.impl.SellerDAOJDBC;

public class DAOFactory {
	public static SellerDAO createSellerDAO() {
		
		return new SellerDAOJDBC(DB.getConnection());
	}
	public static DepartmentDAO createDepartmentDAO() {
		return new DepartmentDAOJDBC(DB.getConnection());
	}
}
