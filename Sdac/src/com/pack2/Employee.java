package com.pack2;

class Emp{
	String name;
	int ID;
	int salary;
	String address;
	void meth1(String name) {
		System.out.println(name);
	}
	void meth2(int ID) {
		System.out.println(ID);
	}
	void meth3(int salary) {
		System.out.println(salary);
	}
	void meth4(String address) {
		System.out.println(address);
	}
	
	
	
	
	
}

public class Employee {
	public static void main(String[] args) {
		Emp obj=new Emp();
		obj.meth1("varun");
		obj.meth2(1234);
		obj.meth3(5000);
		obj.meth4("Kandivali west");
	}
	

}
