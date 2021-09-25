package com.emp;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1= new Employee("Sanjana");
		System.out.println(emp1);
		Employee emp2=new Employee("Sanjana",123);
		Employee emp3=new Employee("Sanjana",123,22);
		Employee emp4=new Employee("Sanjana",123,"Engineer");
		Employee emp5=new Employee("Sanjana",123,22,"Engineer");
		Employee emp6=new Employee("Sanjana",123,22,"Pune");
		Employee emp7 = new Employee("Sanjana",123,22,2);
		Employee emp8=new Employee("Sanjana",123,"Engineer",2);
		Employee emp9=new Employee("Sanjana",123,"Engineer","Pune",2);
		Employee emp10=new Employee("Sanjana",123,22,"Engineer","Pune",2);
		
	}

}
