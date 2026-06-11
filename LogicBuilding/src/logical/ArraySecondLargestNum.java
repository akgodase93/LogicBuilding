package logical;

public class ArraySecondLargestNum {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,5,6};
		
		int largest=Integer.MAX_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
//		for(int i=0; i< arr.length; i++)
//		{
//			if(arr[i]>largest)
//			{
//				secondLargest=largest;
//				largest=arr[i];
//			}
//			else if(arr[i]> secondLargest && arr[i] != largest)
//			{
//				secondLargest=arr[i];
//			}
//		}
		
		for(int a: arr)
		{
			if(a>largest)
			{
				secondLargest=largest;
				largest=a;
			}
			else if(a> secondLargest && a!= largest)
			{
				secondLargest=a;
			}
		}
		
		System.out.println("Second Largest Number in Array: "+secondLargest);
	}

}
