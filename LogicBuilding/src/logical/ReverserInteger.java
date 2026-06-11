package logical;

public class ReverserInteger 
{
	public static void main(String[] args) {
		
		int number=123;
		int reverseNumber=0;
		int reminder;
		
		while(number>0)
		{
			
			reminder=number % 10;
			reverseNumber= reverseNumber*10 +reminder;
			number= number/10;
		}
		System.out.println("Reverse Number:"+reverseNumber);
	}
}
