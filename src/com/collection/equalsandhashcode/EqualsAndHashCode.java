package com.collection.equalsandhashcode;

import java.util.ArrayList;
import java.util.List;

public class EqualsAndHashCode {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Chetan", "Jain", 32));
		employees.add(new Employee(2, "Ankit", "Pathak", 34));
		employees.add(new Employee(3, "Mahesh", "Namdev", 30));
		employees.add(new Employee(4, "Sandeep", "Vishwakarma", 28));
		employees.add(new Employee(5, "Manish", "Sharma", 27));
		employees.add(new Employee(1, "Chetan", "Jain", 32));

		employees.forEach(employee -> {
			System.out.println(employee);
		});

	}
}

class Employee {
	private int id;
	private String fname;
	private String lname;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

	public Employee(int id, String fname, String lname, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (id != other.id)
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}

}