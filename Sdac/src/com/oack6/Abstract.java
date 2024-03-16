package com.oack6;

abstract class A{
	abstract void meth1(String a);
}
class B extends A{
	void meth1(String a) {
		System.out.println(a);
	}
}

public class Abstract {
	public static void main(String[] args) {
		B obj=new B();
		obj.meth1("varun");
	}

}
