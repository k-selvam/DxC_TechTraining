package dxcniitAssignment;

public class FirstNonRepeatedCharacter {
	
	public static char FindFirstNonRepeated(String input) {
		for(int i = 0; i < input.length(); i++) {
			int flag = 0;
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(i) == input.charAt(j) && i != j) {
					flag =1;
					break;
				}
			}
			if(flag == 0) {
				return input.charAt(i);
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aazad";
		System.out.println(FindFirstNonRepeated(input));

	}

}
