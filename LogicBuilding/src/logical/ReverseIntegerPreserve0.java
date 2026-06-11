package logical;

public class ReverseIntegerPreserve0 {
	public static void main(String[] args) {
		
		int number=120;
		
		//String str = String.valueOf(number);
		String str = Integer.toString(number);
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed); // 021
	}

}  
