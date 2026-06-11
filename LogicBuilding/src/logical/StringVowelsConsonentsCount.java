package logical;

public class StringVowelsConsonentsCount {
	public static void main(String[] args) {
		
		String input="Hello";
		char []arr=input.toCharArray();
		String vowels="AEIOUaeiou";
		int vowelCount=0, consonantsCount=0;
		
		
		for(char a: arr)
		{
			if(vowels.indexOf(a) ==-1)
			{
				consonantsCount++;
			}
			else
			{
				vowelCount++;
			}
		}
		
		System.out.println("Input String: "+input+"\nVowels Count:  "+vowelCount+"\nConsonants Count: "+consonantsCount);
	}
}
