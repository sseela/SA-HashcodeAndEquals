package com.cg;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		HashSet<Employee> hashSet = new HashSet<>();
		Employee emp3 = new Employee(333, "Sasi", "hyd");
		hashSet.add(new Employee(111, "sandeep", "mumbai"));
		hashSet.add(new Employee(222, "Rupesh", "Bangalore"));
		hashSet.add(emp3);
		hashSet.add(emp3);
		
		System.out.println(hashSet);
	}
}



/*In Hash*:
1. hashCode()
2. equals()*/


/*Equals and HashCode contract:
When we start overriding equals method, then it is recommended to override hashCode along with equals. 
Contract says that equal objects must have equal hashcodes. 
But reverse is not necessary to be true. Same hashcodes does not mean two objects should be equal.*/


/*conclusions:
1. First hashCode() will be called.
2. When hashCode is called, if hashCode is different, then it will select two different
buckets and it keeps those two objects in the hashtable.
3. When hashCode is called, if hashCode is same, then it will go for equals method to check if both the objects are same. If both
are same, then old object will be replaced with the new.
3. */



/*More conclusions:
1. When we inserted more objects into hashSet, and if hashcode and equals methods are saying that all the objects are same, then
the first object will not be replaced by any other object.*/


/*Why prime numbers are recommended while overriding hashCode method?
hashCode is all about unique values for different objects. So there are very good chances if we use prime number. So that for different
objects, different hashCode will be evaluated.*/
		
		
		

class HashSetExample2 {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Sandeep");
		hashSet.add("Rupesh");
		hashSet.add("Rupesh");
		hashSet.add("Rupesh");
		
		System.out.println(hashSet);
	}
}

class HashSetExample3 {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(new String("Sandeep"));
		hashSet.add(new String("Rupesh"));
		hashSet.add(new String("Rupesh"));
		hashSet.add(new String("Rupesh"));
		
		System.out.println(hashSet);
	}
}
