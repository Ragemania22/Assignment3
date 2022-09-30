
public class Palidrome {

	public static boolean isPalindrome(String text) {
		String text2 = "";
		for(int i = text.length()-1; i >= 0; i --) {
			text2 += text.charAt(i);
		}
		return (text.equals(text2));
		
	}
	
	public static void main(String[] args) {
		String text = "madam";
		
		//convert string to lowercase
		text = text.toLowerCase();
		boolean A = isPalindrome(text);
		System.out.println(A);
		
	}
}
