package com.pack3;

class Variable{
	String name;
	static int  emp_id;
	void meth1(String name) {
		System.out.println(name);
	}
	static void meth2(int emp_id) {
		System.out.println(emp_id);
	}
}

public class Task2 {
	public static void main(String[] args) {
		Variable obj=new Variable();
		obj.meth1("varun");
		obj.meth2(12345);
	}

}
