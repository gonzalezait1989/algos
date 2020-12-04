package com.aitorgonzalez.algos.sem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employees {

	public static void main(String args[]) {
		
		Employees.printEmployeeNames(createEmployeeList());

	}
	
	public static String printEmployeeNames(List<Employee> employees) {
		if(employees == null || employees.isEmpty()) return "";
		String employeeNames = employees.stream()
				.map(Employee::getName).collect(Collectors.joining(","));
		System.out.println(employeeNames);
		return employeeNames;
	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("Gary", 26);
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		return employeeList;
	}
}

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

}