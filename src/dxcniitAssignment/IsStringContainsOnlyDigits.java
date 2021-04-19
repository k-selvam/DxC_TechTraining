package dxcniitAssignment;

public class IsStringContainsOnlyDigits {
	
	public static String ContainsOnlyDigits(String input) {
		int flag = 0;
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))){
				flag = 1;
			}
			else {
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			return (input + " is a number");
		}
		return (input + " is not a number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1a345";
		System.out.println(ContainsOnlyDigits(input));
	}

}
