package inbuilt.Functional.Interface.biparams;

import java.util.function.BiFunction;

import inbuilt.Functional.Interface.Employee;

public class TestBiFunction {
	public static void main(String[] args) {
		BiFunction< Integer, String, Employee> bif = (i,s) -> new Employee(s, i);
		
		Employee employee = bif.apply(1234, "abdul");
		System.out.println(employee.name);
	}

}
