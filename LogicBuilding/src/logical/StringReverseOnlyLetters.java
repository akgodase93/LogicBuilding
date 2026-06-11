package logical;

public class StringReverseOnlyLetters {

	public static void main(String[] args) {

		String input = "1ab2";
		char[] charInput = input.toLowerCase().toCharArray();

		int left = 0, right = charInput.length - 1;

		while (left < right) {
			if (!Character.isLetter(charInput[left])) {
				left++;
			} else if (!Character.isLetter(charInput[right])) {
				right--;
			} else {
				char temp = charInput[left];
				charInput[left] = charInput[right];
				charInput[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println("Revered String: " + new String(charInput));
//		for(char c: charInput)
//			System.out.print(c);
	}
}
