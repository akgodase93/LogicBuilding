package logical;

public class ArrayMissingNumXOR 
{
	public static void main(String[] args) {
		
		int array[]= {1,2,4,5,6};
		int missingNum=0;
		
		for(int i=1; i<=6; i++)
		{
			missingNum=missingNum ^ i;
			
		}
		
//		for(int i=0; i<array.length; i++)
//		{
//			missingNum =missingNum ^ array[i];
//		}
		
		for(int a:array)
		{
			missingNum =missingNum ^ a;
		}
		
		System.out.println("Missing Number is: "+missingNum);
	}
}
