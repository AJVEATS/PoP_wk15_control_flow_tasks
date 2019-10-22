/**
 * 
 * @author Melanie
 * This is the WordPlay class - used to explore if and loop statements
 * 
 */

public class WordPlay {
	
	//Task 1
	
	public String whatComesFirst(String String1, String String2) {
		String first = "";
		String second = "";
		if (String1.toLowerCase().compareTo(String2.toLowerCase()) < 0) {
			first = String1;
			second = String2;
		} else if ( String1.toLowerCase().compareTo(String2.toLowerCase()) > 0) {
			first = String2;
			second = String1;
		} else {
			return String1 + " is the same as " + String2;
		}
		return first + " comes before " + second + " in the alphabet";
	}
	
	//Task 2
	
	public char[] backwardsString(String name) {
		char[] backwards;
		backwards = new char[name.length()];
		for(int i = name.length(); i > 0; i--) {
			for(int j = 0; j > name.length(); j++) {
				backwards[i] = name.charAt(j);
			}
		}
		return backwards;
	}
	
	//task 3
	
	public String[] addressBook(String[] names, String[] numbers) {
		String[] book;
		book = new String[names.length];
		for(int i = 0; i < names.length; i++) {
			book[i] = names[i] + " " + numbers[i];
		}
		return book;
	}
	
	/*Task 4
	public ?? rockPaperScissors(??) {
		??
	}
	*/
	
}
