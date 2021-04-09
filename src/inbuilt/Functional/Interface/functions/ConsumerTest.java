package inbuilt.Functional.Interface.functions;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
	static ArrayList<JavaStudent> javaStudents = StudentTest.PopulateStudents();
	
	public static void main(String[] args) {
		Predicate<JavaStudent> p = s -> s.mark >= 60;
		Consumer<JavaStudent> c = s -> System.out.println(s.name);
		
		for(JavaStudent student: javaStudents) {
			if(p.test(student)) {
			c.accept(student);
			}
		}
	}

}