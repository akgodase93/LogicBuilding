package logical;

public class ArrayMountainCheck {
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,10,4,2,0,1};
		
		System.out.println(checkArrayMountain(arr));
		
	}
	
	public static boolean checkArrayMountain(int arr[])
	{
		//1. length should be greater than 2
		
		if(arr.length < 2)
		{
			return false;
		}
		
		//2. while climbing increase the index
		int i=0;
		
		while(i+1 < arr.length && arr[i] < arr[i+1])
		{
			i++;
		}
		
		//3. while stepping down decrease the index
		
		while(i+1 <arr.length && arr[i]> arr[i+1])
		{
			i++;
		}
		
		if(arr.length-1 == i)
			return true;
		else
			return false;
	}

}
