package application;

import model.DAO.DAOFactory;
import model.DAO.DepartmentDAO;
import model.emtities.Department;

public class Appp2 {

	public static void main(String[] args) {
		DepartmentDAO depDAO = DAOFactory.createDepartmentDAO();
		Department dep = new Department(5, "Games");
		//depDAO.insert(dep);
		//depDAO.update(dep);
		//depDAO.deleteById(dep.getId());
		Department newDep = depDAO.findById(2);
		System.out.println(newDep);

	}

}
