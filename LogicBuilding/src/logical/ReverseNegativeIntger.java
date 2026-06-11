package logical;

public class ReverseNegativeIntger {
	public static void main(String[] args) {
		
		int number=-123;
		
		System.out.println(reverseNumber(number));
		
	}
	
	public static int reverseNumber(int number)
	{
		boolean isNegative= number<0;
		
		number=Math.abs(number);
		int reverse=0;
		int reminder;
		while(number>0)
		{
			reminder= number % 10;
			
			//check underflow and overflow condition
			if((reverse >Integer.MAX_VALUE /10) || 
					(reverse == Integer.MAX_VALUE/10 && reminder >7)|| 
					(reverse<Integer.MIN_VALUE/10) || (reverse == Integer.MIN_VALUE/10 && reverse<-8))
			{
				System.out.println(0);
				System.exit(0);
			}
			reverse=reverse *10+reminder;
			number =number /10;
		}
		return isNegative ? -reverse: reverse;
	}

}
