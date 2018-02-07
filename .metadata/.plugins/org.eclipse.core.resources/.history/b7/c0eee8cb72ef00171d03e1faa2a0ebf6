package com.mulesoft.training;

import java.util.Comparator;

public class Employee implements java.io.Serializable, Comparable<Employee> {

	int id;
	int age;
	int salary;
	String name;
	
	public Employee()	{

	}

	public Employee(int id, int age, String name,int salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
		@Override
			public int compareTo(Employee otherEmployee) {
				int value = Double.compare(this.getAge(), otherEmployee.getAge());
				return value;
			} 


	};
