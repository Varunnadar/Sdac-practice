package com.pack4;

class Overl{
	void meth1(int a) {
		System.out.println(a);
		
	}
	void meth1(String a) {
		System.out.println(a);
		
	}
}

public class Overload {
	public static void main(String[] args) {
		Overl obj=new Overl();
		obj.meth1("123");
		obj.meth1("varun");
	}

}
