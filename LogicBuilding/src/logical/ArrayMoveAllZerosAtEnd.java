package logical;

public class ArrayMoveAllZerosAtEnd {

	public static void main(String[] args) {
		
		int arr[]= {1,0,2,0,3,0,4};
		
		int current=0;
		int nonZero=0;
		
		for(current=0; current<arr.length; current++)
		{
			if(arr[current] != 0)
			{
				int temp=arr[nonZero];
				arr[nonZero]=arr[current];
				arr[current]=temp;
				nonZero++;
			}
		}
		
		for(int a: arr)
			System.out.print(a+" ");
	}
} 
