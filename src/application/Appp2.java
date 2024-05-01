package application;

import model.DAO.DAOFactory;
import model.DAO.DepartmentDAO;
import model.emtities.Department;

public class Appp2 {

	public static void main(String[] args) {
		DepartmentDAO depDAO = DAOFactory.createDepartmentDAO();
		Department dep = new Department(null, "Games");
		depDAO.insert(dep);

	}

}
