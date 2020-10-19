package org.test;

import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		System.out.println("default vector capacity :"+v.capacity());
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(50);
		v.addElement(70);
		v.addElement(80);
		v.addElement(90);
		v.addElement(100);
		v.addElement(101);
		System.out.println(v);
		System.out.println("current capacity :"+v.capacity());
		v.remove(5);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);

	}

}
