package logical;

public class StringEvenLengthWords {
	public static void main(String[] args) {
		
		String str="Sky is blue and vast";
		
		String[] strArr= str.split(" ");
		for(String s: strArr)
		{
			if(s.length() %2 == 0)
			{
				System.out.println(s);
			}
		}
	}

}
