package model.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DBException;
import model.DAO.DepartmentDAO;
import model.emtities.Department;
import model.emtities.Seller;

public class DepartmentDAOJDBC implements DepartmentDAO {

	Connection connection = null;

	public DepartmentDAOJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void insert(Department dep) {
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("INSERT INTO department " + "(Name) " + "VALUES (?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, dep.getName());
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					dep.setId(id);
				}
				rs.close();
			} else {
				throw new DBException("Unexpected error occured, try again");
			}
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally{
			DB.closeStatement(ps);
		}

	}

	@Override
	public void update(Department dep) {
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(
					"UPDATE department "
					+ "SET Name = ?"
					+ "WHERE Id = ?");
			ps.setInt(2, dep.getId());
			ps.setString(1, dep.getName());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
		}

	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("DELETE FROM department WHERE Id = ?");
			
			ps.setInt(1, id);
			
			ps.executeUpdate();
		}
		catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
		}

	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(
					"SELECT * FROM department "
					+"WHERE id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				Department dep = instantiateDepartment(rs);
				return dep;
			}
			return null;
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep =new Department();
		dep.setId(rs.getInt("Id"));
		dep.setName(rs.getString("Name"));
		return dep;
	}

}
