package dxcniitAssignment;

public class PalindromeNumber {
	
	public static void FindPalindrome(int input) {
		int temp = input;
		int res = 0;
		while(temp != 0) {
			res = res * 10 + (temp % 10);
			temp /= 10;
		}
		if(input == res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12321;
		FindPalindrome(input);

	}

}
