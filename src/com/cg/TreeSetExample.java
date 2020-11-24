package com.cg;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<>();
		Employee emp3 = new Employee(333, "sasi", "hyd");
		set.add(new Employee(111, "sandeep", "mumbai"));
		set.add(new Employee(222, "Rupesh", "bang"));
		set.add(emp3);
		set.add(emp3);
		
		System.out.println(set);
	}
}


/*
In Tree*:
compareTo
*/



/*In Tree*, only compareTo will be called, but it is recommended that the object which we are going to insert in Tree* is 
having compareTo() consistent with equals().*/



/*Why compareTo() should be consistent with equals()?
For suppose, compareTo() saying objects are equal(0) but equals() saying objects are not equal. 
Tree* always use compareTo(), there is no relation of Tree* with equals(), but when we use the same object with Hash*, then
it says that two objects are different and so two objects will be placed.*/


/*There is same problem with the BigInteger in Java API.
For BigDecimal, compareTo() says both the objects are equal, but equals() says both are not equal.*/

class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<BigDecimal> set = new TreeSet<>();
		set.add(new BigDecimal(5.0));
		set.add(new BigDecimal(5.00));
		
		System.out.println(set);
	}
}

class HashSetExample5 {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal(2.0);
		BigDecimal b2 = new BigDecimal(2.00);
		System.out.println(b1.equals(b2));
		System.out.println(b1.compareTo(b2));
		/*HashSet<BigDecimal> hashSet = new HashSet<>();
		hashSet.add(new BigDecimal(2.0));
		hashSet.add(new BigDecimal(2.00));
		
		System.out.println(hashSet);*/
	}
}