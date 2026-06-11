package logical;

public class ArrayLeadersProblem2 {
	public static void main(String[] args) {

		int arr[] = { 16, 17, 4, 3, 5, 2 };
		int length = arr.length;
		int maxRight = arr[length-1];
		

		int[] leaders = new int[arr.length];
		int count = 0;

		leaders[count++] = maxRight;

		for (int i = arr.length - 2; i >= 0; i--) {

		    if (arr[i] > maxRight) {
		        maxRight = arr[i];
		        leaders[count++] = maxRight;
		    }
		}
		
		for (int i = count - 1; i >= 0; i--) {
		    System.out.print(leaders[i] + " ");
		}
		
	}
}
