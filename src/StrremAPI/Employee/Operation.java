package StrremAPI.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Operation {

	public static void main(String[] args) {
		Employee e1=new Employee("Deep",5000);
		Employee e2=new Employee("Amar",7000);
		Employee e3=new Employee("Vivek",3000);
		Employee e4=new Employee("Arif",8000);
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		//print employee in ascending order 
		System.out.println("employee in ascending order a/c to salary");
		
		List<Employee>sortedList=list.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).collect(Collectors.toList());
		
		for (Employee employee : sortedList) {
			System.out.println(employee);
		}
		System.out.println();
		
		//minimum salary
		
		Employee employee = list.stream().min((o1,o2)->o1.getSalary()-o2.getSalary()).get();
		System.out.println("minimum salary employee="+employee);
		System.out.println();

		//maximum salary 
		
		Employee employee2 = list.stream().max((o1,o2)->o1.getSalary()-o2.getSalary()).get();
		System.out.println("maximum salary employee="+employee2);
		System.out.println();

		
		//print employee in alphabetical order
		System.out.println("employee in alphabetical order");
		List<Employee> collect = list.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		for (Employee employee3 : collect) {
			System.out.println(employee3);
		}
		System.out.println();
		
		//increase each employee salary by 2000
		
		List<Integer> collect2 = list.stream().map(e->e.getSalary()+200).collect(Collectors.toList());
		for (Integer integer : collect2) {
			System.out.println(integer);
		}
		
		//print names which starts with a
		
		List<Employee> collect3 = list.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList());
		for (Employee employee3 : collect3) {
			System.out.println(employee3);
		}
	}
}
