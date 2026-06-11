package logical;

/* pattern HollowPyramid

1
12
1 3
1  4
12345

 */
public class PatternNumberHollowPyramid 
{
	public static void main(String[] args) {
		
		int totalNoOfRows=5;
		
		for(int rows=1; rows<=totalNoOfRows; rows++)
		{
			
			for(int cols=1; cols<=rows; cols++)
			{
				if(cols ==1 || cols ==rows || rows == totalNoOfRows)
				{	
					System.out.print(cols);
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
