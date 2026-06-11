package logical;

import java.math.BigInteger;

public class FactorialBigInteger {
	public static void main(String[] args) {
		
		int number=50;
		BigInteger fact=BigInteger.ONE;
		
		for(int i=1; i<=number; i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Factorial of "+number+" : "+fact);
	}

}
