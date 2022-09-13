package StrremAPI.Employee;

public class Employee {
 
	private String name;
	private int salary;
	public Employee(String name1, int salary1) {
		name=name1;
		salary=salary1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
