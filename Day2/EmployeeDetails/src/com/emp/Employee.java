package com.emp;

public class Employee {
	private int empId,empAge,empExpInYrs;
	private String empName,empLocation,empDesgn;
	
	
	
	
	public Employee(String empName) {
		super();
		this.empName = empName;
	}
	
	
	public Employee( String empName,int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}


	public Employee(String name,int id,int age)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empAge=age;
	}
	
	public Employee(String name,int id,String desn)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empDesgn=desn;
	}
	public Employee(String name,int id,int age,String location)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empAge=age;
		this.empLocation=location;
	}
	public Employee(String name,int id,int age,int experience)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empAge=age;
		this.empExpInYrs=experience;
	}

	
	public Employee(String name,int id,String desn,int experience)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empDesgn=desn;
		this.empExpInYrs=experience;
	}
	public Employee(String name,int id,String desn,String location,int experience)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empDesgn=desn;
		this.empLocation=location;
		this.empExpInYrs=experience;
	}
	public Employee(String name,int id,int age,String location,String desn,int experience)
	{
		super();
		this.empName=name;
		this.empId=id;
		this.empAge=age;
		this.empLocation=location;
		this.empDesgn=desn;
		this.empExpInYrs=experience;
	}
	
}
