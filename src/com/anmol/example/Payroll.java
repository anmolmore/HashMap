package com.anmol.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Payroll {
	public static void main(String[] args) {
		Map<Employee,Integer> employeeMap = enrollEmployees();
		Iterator it = employeeMap.keySet().iterator();
		System.out.println(employeeMap);
	}
	
	private static Map enrollEmployees() {
		Map map = new HashMap();
		int i=1;
		while(i<5000) {
			Employee emp = new Employee(i,new Integer(i).toString());
			map.put(emp, i*1000);
			i++;
		}
		return map;
	}
}
