package com.testexample;

class Inheritance {
  int supervalue = 10;
  public void nonoverridedMethod () {
	  System.out.println("SuperClass String");
  }
  
  public void overridedMethod () {
	  System.out.println("This should not be printed");
  }
}


class Hereby extends Inheritance {
	int ownvalue = 9;
	
	public void overridedMethod () {
		System.out.println("Method was overriden");
	}
	
	public void overridedMethod (String s) {
		System.out.println(s);
	}
	
	public void printSuperValue() {
		System.out.println("superclass variable: "+super.supervalue);
	}
}


class Implementation {
	public static void main (String[ ] args) {
		Hereby hrb = new Hereby();
		hrb.nonoverridedMethod();
		hrb.printSuperValue();
		hrb.overridedMethod();
		hrb.overridedMethod("Method Overloaded");

	}
}