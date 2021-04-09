package inbuilt.Functional.Interface.functions;

import java.util.function.Function;

public class TestfunctionalIF {
public static void main(String[] args) {
	Function<Integer, Integer> f = i -> i*i;
	System.out.println(f.apply(4));
	Function<String, Integer> f1 = i -> i.length();
	System.out.println(f1.apply("selvam"));
	
}
}
