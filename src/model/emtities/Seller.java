package model.emtities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Seller implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private LocalDate birthday;
	private double baseSalary;
	
	private Department department;

	public Seller() {
	}

	public Seller(Integer id, String name, String email, LocalDate birthday, double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, birthday, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Double.doubleToLongBits(baseSalary) == Double.doubleToLongBits(other.baseSalary)
				&& Objects.equals(birthday, other.birthday) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthday=" + birthday + ", baseSalary="
				+ baseSalary +" "+department+ "]";
	}

}
