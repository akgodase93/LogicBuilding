package logical;

public class ArrayLeadersProblem {
	public static void main(String[] args) {

		int arr[] = { 16, 17, 4, 3, 5, 2 };
		int length = arr.length;
		int maxRight = arr[length-1];

		System.out.print(maxRight);

		for (int index = length - 2; index >= 0; index--) {
			if (arr[index] > maxRight) {
				maxRight = arr[index];
				System.out.print(" " + maxRight);
			}
		}
	}
}
