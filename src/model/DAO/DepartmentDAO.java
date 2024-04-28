package model.DAO;

import java.util.List;

import model.emtities.Department;

public interface DepartmentDAO {
	void insert(Department dep);
	void update(Department dep);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
