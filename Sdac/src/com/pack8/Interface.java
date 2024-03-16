package com.pack8;

interface A{
	 abstract void meth1(String a);
}
class C implements A{
	public void meth1(String a) {
		System.out.println(a);
	}
	
	
}

public class Interface {
	public static void main(String[] args) {
		C obj=new C();
		obj.meth1("varun");
		
	}

}
