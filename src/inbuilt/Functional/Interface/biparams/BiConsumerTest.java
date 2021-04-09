package inbuilt.Functional.Interface.biparams;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import inbuilt.Functional.Interface.functions.JavaStudent;
import inbuilt.Functional.Interface.functions.StudentTest;

public class BiConsumerTest {
	public static void main(String[] args) {
		ArrayList<JavaStudent> javaStudents = StudentTest.PopulateStudents();
		BiConsumer<JavaStudent, Integer> bic = (j,i) -> j.mark += 10;
		
		for(JavaStudent j : javaStudents) {
			bic.accept(j, 10);
			System.out.println(j.name+"\t"+j.mark);
		}
	}

}
