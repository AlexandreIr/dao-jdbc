package model.DAO.impl;

import java.sql.Connection;
import java.util.List;

import model.DAO.DepartmentDAO;
import model.emtities.Department;

public class DepartmentDAOJDBC implements DepartmentDAO {
	
	Connection connection = null;
	
	public DepartmentDAOJDBC(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void insert(Department dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Department dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
