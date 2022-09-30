
public class UniqueCharacters {

	public static void main(String[] args) {
		//Question 1
		System.out.println(hasUniqueCharacters("John"));
	}
	//Part of Question 1
	private static boolean hasUniqueCharacters(String str) {
		for(char ch : str.toCharArray()) {
			if(str.indexOf(ch) == str.lastIndexOf(ch))
				continue;
			else
				return false;
		}
		return true;
	}

}
