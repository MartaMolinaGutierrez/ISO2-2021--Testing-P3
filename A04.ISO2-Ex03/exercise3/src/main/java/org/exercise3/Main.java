package org.exercise3;

public class Main {

	public static void main(String[] args) {
		FunctionalSuitability f = new FunctionalSuitability(2,3,5);
		Maintainability m = new Maintainability(4,8,3,6,4);
		Certificate c = new Certificate(f, m);
		System.out.println(c.toString());

	}
}