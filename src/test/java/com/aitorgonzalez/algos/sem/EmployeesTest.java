package com.aitorgonzalez.algos.sem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeesTest {

	@Test
	void printNameList() {
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

		String expectedEmployeeNamesList = "John,Martin,Mary,Stephan,Gary";
		String employeeNamesList = Employees.printEmployeeNames(employeeList);
		Assertions.assertEquals(employeeNamesList, expectedEmployeeNamesList);
	}

	@Test
	void printNameOneEmployee() {
		Employee e1 = new Employee("John", 21);
		String expectedEmployeeNamesList = "John";
		String employeeNamesList = Employees.printEmployeeNames(Arrays.asList(e1));
		Assertions.assertEquals(employeeNamesList, expectedEmployeeNamesList);
	}

	@Test
	void printNameEmptyList() {
		String expectedEmployeeNamesList = "";
		String employeeNamesList = Employees.printEmployeeNames(Collections.emptyList());
		Assertions.assertEquals(employeeNamesList, expectedEmployeeNamesList);
	}

	@Test
	void printNameNullList() {
		String expectedEmployeeNamesList = "";
		String employeeNamesList = Employees.printEmployeeNames(null);
		Assertions.assertEquals(employeeNamesList, expectedEmployeeNamesList);
	}
}
