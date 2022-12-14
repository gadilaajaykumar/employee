package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="audit")
public class Audit {
	
	@Id
	public String employee_id;
	private String first_name;
	private String second_name;
	private int salary;
	
	public Audit(String employee_id, String first_name, String second_name, int salary) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.second_name = second_name;
		this.salary = salary;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
