package logical;
/*
 * 
 		Input:ab12cd34
 		Output:ab43cd21
 * 
 */


public class StringReverseOnlyDigits {
	public static void main(String[] args) {
		
		String input="ab12cd34";
		char[] arr=input.toCharArray();
		
		int left=0;
		int right=arr.length-1;
		
		
		while(left<right)
		{
			if(!(Character.isDigit(arr[left])))
				left++;
			else if(!(Character.isDigit(arr[right])))
				right--;
			else
			{
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++; right--;
			}
		}
		
		System.out.println("Reversed String: "+new String(arr));
	}
}
