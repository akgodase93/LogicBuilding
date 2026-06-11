package logical;

public class ArrayNumbersSum {

	public static void main(String[] args) {
		
		int arr[]= {1,2,56,3};
		int sum=0;
		
		for(int a: arr)
		{
			sum+=a;
		}
		System.out.println("Sum of numbers in array is: "+sum);
	}
}
