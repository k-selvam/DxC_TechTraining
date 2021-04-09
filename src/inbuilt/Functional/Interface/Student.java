package inbuilt.Functional.Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Student {
	public static void main(String[] args) {
		int m1, m2, m3;
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		int sum = m1 + m2 + m3;
		Predicate<Integer> p = i -> i > 75;
		
		if(p.test(sum)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		
	}
}
