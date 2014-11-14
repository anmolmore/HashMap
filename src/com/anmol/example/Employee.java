package com.anmol.example;

public class Employee {
	private int id;
	private String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public int hashCode() {
		if(id%2 == 0) {
			return 2;
		}
		else 
			return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(this.name.equalsIgnoreCase(emp.name)) {
			return true;
		}
		else
			return false;
	}
}
