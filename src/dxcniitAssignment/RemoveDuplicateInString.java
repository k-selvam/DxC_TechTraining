package dxcniitAssignment;

public class RemoveDuplicateInString {
	
	public static void RemoveDuplicate(String input) {
		String res = "";
		for (int i = 0; i < input.length(); i++) {
			int flag = 1;
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(i) == input.charAt(j) && i != j) {
					flag++;
					input.replace(input.charAt(j), '\0');
				}
			}
			if(flag == 1) {
				res = res + input.charAt(i);
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "kalam aashik";
		RemoveDuplicate(input);

	}

}
