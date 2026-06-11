package logical;

public class StringLengthOfLastWord 
{
	public static void main(String[] args) {
		
		String str="  Hello!  Madam   ";
		
		char[] strArray=str.toCharArray();
		int count=0;
		
		for(int i=strArray.length-1; i>=0; i--)
		{
			if(strArray[i] != ' ')
			{
				count++;
			}
			else {
				if(count>0)
				{
					System.out.println("Length of last word: "+count);
					break;
				}
			}
		}
		
	}
}
