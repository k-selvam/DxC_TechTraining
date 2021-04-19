package dxcniitAssignment;

public class MaxAndMinInArray {
	
	public static void FindMinMax(int[] input) {
		int min = input[0];
		for(int i = 0; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		System.out.println("Smallest in Array is " + min);
		int max = input[0];
		for(int i = 0; i < input.length; i++) {
			if(max < input[i]) {
				max = input[i];
			}
		}
		System.out.println("Largest in Array is " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2, 8, 3, 12, 18, 1};
		FindMinMax(input);

	}

}
