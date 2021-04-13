package lambdaExp;
import java.util.function.Function;
public class FirstLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sq = square(4);
		System.out.println(sq);
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(4));*/
		ISum is = (a, b)->a+b;
		System.out.println(is.add(10,20));
		FuncInterface f1 = ()->System.out.println("hello");
		f1.m1();
		/*Function<Integer, Integer> g = (a,b)->a+b;*/
		
	}
	public static int square(int n) {
		return n*n;
	}
	public static void m1() {
		System.out.println("hello");
		//()->System.out.println("hello");
	}
	public static int add(int a, int b) {
		return a+b;
		//(a, b)->a+b
	}
}
