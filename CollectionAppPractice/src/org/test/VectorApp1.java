package org.test;

import java.util.Vector;

public class VectorApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println("default capacity ="+v.capacity());
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(30);
		v.addElement(10);
		v.addElement(20);
		System.out.println(v);
		System.out.println("after addElement="+v.capacity());
	}

}
