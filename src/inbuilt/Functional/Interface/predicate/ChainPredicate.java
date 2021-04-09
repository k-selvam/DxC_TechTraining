package inbuilt.Functional.Interface.predicate;

import java.util.function.Predicate;

public class ChainPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = i -> i % 2 == 0; 
		Predicate<Integer> p2 = i -> i >= 10;
		int intArray[] = {10, 5, 7, 3, 26, 17, 18, 35};
		System.out.println("elements both greater than 10 and even are");
		for(int i : intArray) {
			if(p1.and(p2).test(i)) {
				System.out.println(i);
			}
		}
		System.out.println("elements which are greater than 10 or even are");
		for(int i : intArray) {
			if(p1.or(p2).test(i)) {
				System.out.println(i);
			}
		}

	}

}
