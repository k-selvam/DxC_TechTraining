package dxcniitAssignment;
//input -> {1, 2, 2, 3, 4, 4, 5}
//output -> {1, 2, 3, 4, 5}
public class RemoveDuplicateInSortedArray {
	
	public static void RemoveDuplicate(int[] input) {
		System.out.print(input[0] + " ");
		for (int i = 1; i < input.length; i++) {
			if (input[i] != input[i - 1]) {
				System.out.print(input[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 2, 2, 3, 4, 4, 5 };
		RemoveDuplicate(input);
		
	}
	
}
