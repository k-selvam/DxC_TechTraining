package lambdaExp.collection;

public class Employee {
	String name;
	int eid;
	public Employee(String string, int  n) {
		name = string;
		eid=n;
	}
	
	@Override
	public String toString() {
		return eid+"-"+name;
	}
}

