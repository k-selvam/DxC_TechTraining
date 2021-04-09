package inbuilt.Functional.Interface.biparams;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class TestStudentIfeligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Student> bif = (i, j) -> new Student(i, j);
		Student student = bif.apply(15, 65);
		
		BiPredicate< Integer, Integer> bp = (a,b) -> ((a>18) && (b>60));
		
		Supplier<String> s1 = () -> {
			if(bp.test(student.age, student.sum)) {
				return "eligible";
			}
			else {
				return "not eligible";
			}
		};
		System.out.println(s1.get());

	}

}
