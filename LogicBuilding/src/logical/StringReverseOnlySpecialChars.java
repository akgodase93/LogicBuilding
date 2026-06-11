package logical;

public class StringReverseOnlySpecialChars 
{
	public static void main(String[] args) {
		
		String input="a@b#c$d%";
		char[] arr=input.toCharArray();
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			if((Character.isLetterOrDigit(arr[left])))
			{
				left++;
			}
			else if((Character.isLetterOrDigit(arr[right])))
				right --;
			
			else
			{
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++; right--;
			}
		}
		
		System.out.println("Reversed String: "+ new String(arr));
	}
}
