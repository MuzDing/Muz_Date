package day3;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int num;
	private String name;
	private double price;
	private Employee up_boss;
	private List<Employee> down_employees;

	public Employee() {
		this.num = 100;
		this.name = "Muz";
		this.price = 1000.00;
		this.up_boss = null;
		this.down_employees = new ArrayList<Employee>();
	}

	public Employee getUp_boss() {
		return up_boss;
	}

	public void setUp_boss(Employee up_boss) {
		this.up_boss = up_boss;
	}

	public List<Employee> getDown_employee() {
		return down_employees;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", price=" + price + ", up_boss=" + up_boss
				+ "]";
	}

	public void printDownEmployee() {
		System.out.println(this.down_employees);
	}
	
	public void printDownEmployeeCount() {
		System.out.println(this.down_employees.size());
	}


	public void addDownEmployee(Employee down_employee) {
		this.down_employees.add(down_employee);
	}

}
