package dxcniitAssignment;
import java.util.Arrays;

public class StringAnagram {
	
	public static String FindAnagram(String input1, String input2) {
		if(input1.length() != input2.length()) {
			return "Not Anagram";
		}
		char a[] = input1.toCharArray();
		char b[] = input2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			return "Anagram";
		}
		else {
			return "Not Anagram";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "abcde";
		String input2 = "edcab";
		System.out.println(FindAnagram(input1, input2));
	}

}
