package lambdaExp.collection;
import java.util.*;
public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("abdul", 1234));
		emp.add(new Employee("Ansari", 7353));
		emp.add(new Employee("Nithinga", 8873));
		emp.add(new Employee("lahari", 2355));
		emp.add(new Employee("rakesh", 3765));
		System.out.println(emp);
		Comparator<Employee> c = (e1, e2)->(e1.eid<e2.eid)?-1:(e1.eid>e2.eid)?1:0;//sort using lamda expression
		Collections.sort(emp, c);
		//Collections.sort(emp, new EmployeeComparator());     //-->sort by using comparator interface
		System.out.println(emp);
		Comparator<Employee> d = (e1, e2)->e1.name.compareToIgnoreCase(e2.name);
		Collections.sort(emp, d);
		System.out.println(emp);
		
	}

}
