package LamdaExp.Collections;
import java.util.*;
public class ListNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(20);
		al.add(60);
		al.add(15);
		al.add(40);
		al.add(10);
		System.out.println(al);
		Comparator<Integer> c = (o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(al, c);
		System.out.println(al);

	}

}
