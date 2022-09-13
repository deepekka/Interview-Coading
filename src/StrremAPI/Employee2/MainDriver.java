package StrremAPI.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {


	public static void main(String[] args) {
		List<Employee> employee=new ArrayList<Employee>();
		Employee e1=new Employee("deep", 21, 5000);
		Employee e2=new Employee("amar", 26, 7000);
		Employee e3=new Employee("arif", 23, 3000);
		Employee e4=new Employee("masoom", 25, 8000);
		Employee e5=new Employee("vivek", 24, 9000);
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		//begningList
		System.out.println("employee details");
		for (Employee empl: employee) {
			System.out.println(empl);
		}
		System.out.println();
		
		//print all the employees in ascending order a/c names
		System.out.println("all the employees in ascending order a/c names");
		List<Employee> sortedemp=employee.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		
		for (Employee emp : sortedemp) {
			System.out.println(emp);
		}
		System.out.println();
		
		//print all the employee in ascending order a/c to salary
		System.out.println("all the employee in ascending order a/c to salary");
		List<Employee>sortedsal	=employee.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).collect(Collectors.toList());
		for (Employee emp1:sortedsal) {
		System.out.println(emp1);}
		System.out.println();
		
		//print max salary from employees
		System.out.println("max salary from employees");
		Employee maxsal = employee.stream().max((o1,o2)->o1.getSalary()-o2.getSalary()).get();
		System.out.println(maxsal);
		System.out.println();
		
		//print minimum salary from employee
		System.out.println("minimum salary from employee");
		Employee minsal = employee.stream().min((o1,o2)->o1.getSalary()-o2.getSalary()).get();
		System.out.println(minsal);
		System.out.println();
		
		//print all the employee whose age is below 24
		System.out.println("all the employee whose age is below 24");
		List<Employee> below24 = employee.stream().filter(e->{
			if(e.getAge()<=24)
			return true;
			else
			return false;
		}).collect(Collectors.toList());
		for(Employee emp3:below24) {
			System.out.println(emp3);
		}
		System.out.println();
		
		//print employees whose name starts with a
		System.out.println("employees whose name starts with a");
		List<Employee> name_a = employee.stream().filter(e->e.getName().startsWith("a")).collect(Collectors.toList());
		for (Employee emp4 : name_a) {
			System.out.println(emp4);
		}
		System.out.println();
		
		//increment each employee salary by 10%
		System.out.println("increment each employee salary by 10%");
		 List<Employee> increment10 = employee.stream().map(e->{
			 e.setSalary(e.getSalary()+(int)(e.getSalary()*0.1));
			 return e;
		 }).collect(Collectors.toList());
		for (Employee emp5 : increment10) {
			System.out.println(emp5);
		}
		System.out.println();
		
		
		//increment employee salary by 50% whose is over 24 years
		System.out.println("increment employee salary by 50% whose is over 24 years");
		List<Employee> incrementage24 = employee.stream().map(e->{
			if(e.getAge()>24)
				e.setSalary(e.getSalary()+(int)(e.getSalary()*0.5));
			return e;
		}).collect(Collectors.toList());
		for (Employee emp6 : incrementage24) {
			System.out.println(emp6);
		}
	}
}
