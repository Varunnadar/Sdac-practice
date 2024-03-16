package com.pack5;

class Overr{
	void meth1(String a) {
		System.out.println(a);
	}
	void meth2(int a) {
		System.out.println(a);
	}
}
class A extends Overr{
	void meth2(int a) {
		System.out.println(a);
	}
}

public class Overriding {
	public static void main(String[] args) {
		A obj=new A();
		obj.meth1("varun");
		obj.meth2(12);
		obj.meth2(10);
	}

}
