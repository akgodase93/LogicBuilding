package logical;

public class ArrayMissingNum1 {
	public static void main(String[] args) {
		
		int array[]= {1,2,4,5,6};
		
		int sumOfArraySequence=0; 
		int n=array.length+1;
		int missingNum;
		int sumOfGivenArray=0;
		
		//sumOfArraySequence=n * (n+1)/2;
		
		for(int i=1; i<=n; i++)
		{
			sumOfArraySequence= sumOfArraySequence + i;
		}
		
		
				
//		for(int i=0; i<array.length;i++)
//		{
//			sumOfGivenArray = sumOfGivenArray + array[i];
//		}
		
		for(int a: array)
		{
			sumOfGivenArray = sumOfGivenArray + a;
		}
		
		missingNum=sumOfArraySequence-sumOfGivenArray;
		System.out.println("Missing Number Is: "+missingNum);
		
		
		
	}

}
