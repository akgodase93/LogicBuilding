package logical;

/*
 * 
Input: I Love Java Programming
Output: Programming Java Love I
 */

public class StringReverseWordPostion 
{
	public static void main(String[] args) {
		
		String input="I Love Java Programming";
		String[] arr=input.trim().split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
