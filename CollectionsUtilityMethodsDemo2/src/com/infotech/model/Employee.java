package com.infotech.model;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		return this.getId().compareTo(e.getId());
	}
}
