package inbuilt.Functional.Interface;

import java.util.function.Predicate;

public class StudentResult {

public static void main(String[] args) {
		Student s = new Student(20, 30, 35);
		int sum = s.m1 + s.m2 + s.m3;
		Predicate<Integer> p = i -> i > 75;
		
		if(p.test(sum)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		
	}

}
