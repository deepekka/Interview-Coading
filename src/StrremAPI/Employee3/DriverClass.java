package StrremAPI.Employee3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DriverClass {
public static void main(String[] args) {
	Employee e1=new Employee(101, "Deep", 222, "active", 5000);
	Employee e2=new Employee(102, "Amar", 333, "active", 7000);
	Employee e3=new Employee(103, "Vivek", 222, "inactive", 6500);
	Employee e4=new Employee(104, "Arif", 555, "inactive", 10000);
	Employee e5=new Employee(105, "Sagar", 555, "active", 8000);
	Employee e6=new Employee(106, "Masoom", 222, "active", 12000);
	
	List<Employee> employee= new ArrayList<Employee>();
	employee.add(e1);
	employee.add(e2);
	employee.add(e3);
	employee.add(e4);
	employee.add(e5);
	employee.add(e6);
	
	System.out.println("group by empid");
	
	  Map<Integer, List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDep_id,Collectors.toList()));
	
	collect.entrySet().forEach(e->{
		System.out.println(e.getKey()+"-------"+e.getValue());
	});
	System.out.println();
	
	
	System.out.println("group by status");
	
	Map<String, List<Employee>> collect2 = employee.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.toList()));
	collect2.entrySet().forEach(e->{
		System.out.println(e.getKey()+"------->>"+e.getValue());
	});
	
	System.out.println();
	
	System.out.println("count in each dept");
	   Map<Integer, Long> collect3 = employee.stream().collect(Collectors.groupingBy(Employee::getDep_id,Collectors.counting()));
	
	collect3.entrySet().forEach(e->{
		System.out.println(e.getKey()+"-------"+e.getValue());
	});
	
	System.out.println();
	
	System.out.println("count in status ");
	Map<String, Long> collect4 =employee.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.counting()));
	collect4.entrySet().forEach(e->{
		System.out.println(e.getKey()+"------->>"+e.getValue());
	});
}
}
