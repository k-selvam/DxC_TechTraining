package lambdaExp.DefaultStatic;

public interface IUtility {
	public static boolean isEligible(int age) {
		return age >= 8 ? true : false;
	}

}
