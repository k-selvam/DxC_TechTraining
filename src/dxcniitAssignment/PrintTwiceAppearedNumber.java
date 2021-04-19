package dxcniitAssignment;
//import org.apache.commons.lang3.ArrayUtils;

public class PrintTwiceAppearedNumber {

	public static void TwiceAppeared(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int flag = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					flag++;
					//input = ArrayUtils.remove(input, j);
					//j--;
					input[j] = '\0';
				}
			}
			if (flag == 2 && input[i] != '\0') {
				System.out.print(input[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 2, 2, 3, 4, 4, 4, 3};
		TwiceAppeared(input);

	}

}
