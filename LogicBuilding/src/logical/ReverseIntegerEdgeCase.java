package logical;

public class ReverseIntegerEdgeCase {
	public static void main(String[] args) {
		
		int number=2147483647; 
		int reverseNumber=0;
		int reminder;
		
		while(number >0)
		{
			reminder=number % 10;
			
			if((reverseNumber >Integer.MAX_VALUE/10)  || (reverseNumber== Integer.MAX_VALUE/10 && reminder> 7))
			{
				System.out.println(0);
				System.exit(0);
			}
			
			if((reverseNumber <Integer.MIN_VALUE /10) || (reverseNumber == Integer.MIN_VALUE /10 && reminder < -8))
			{
				System.out.println(0);
				System.exit(0);
			}
			reverseNumber=reverseNumber *10+ reminder;
			number= number /10;
		}
		
		System.out.println("Reverse Number: "+reverseNumber);
		
	}

}
