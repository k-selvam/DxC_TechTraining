package inbuilt.Functional.Interface.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {
	static ArrayList<JavaStudent> javastudents;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopulateStudents();
		Function<JavaStudent, String> f = s -> {
			if (s.mark > 80) {
				return "destinction";
			} else if (s.mark > 60) {
				return "first class";
			} else {
				return "pass mark";
			}
		};
		for (JavaStudent i : javastudents) {
			System.out.println(i.name + "\t" + f.apply(i));
		}

	}

	public static void PopulateStudents() {
		javastudents = new ArrayList<JavaStudent>();
		javastudents.add(new JavaStudent("selvam", 70));
		javastudents.add(new JavaStudent("subash", 80));
		javastudents.add(new JavaStudent("rahul", 95));
		javastudents.add(new JavaStudent("vicky", 55));
		javastudents.add(new JavaStudent("sundar", 63));

	}

}
