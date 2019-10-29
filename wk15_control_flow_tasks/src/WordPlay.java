/**
 * 
 * @author Melanie
 * This is the WordPlay class - used to explore if and loop statements
 * 
 */
import java.util.Random;

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
	
	public String backwardsString(String name) {
		String flippedword = " "; 
		  flippedword = name;
		  StringBuilder temp = new StringBuilder();
		  temp.append(flippedword);
		  String flippedName = temp.reverse().toString();
		  return flippedName;
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
	
	//Task 4
	
	public String rockPaperScissors(String userGuess) {
		
		String compGuess = "";
		String result = "";
		Random rand = new Random();
		int compNum = rand.nextInt(3);
		
		if (compNum == 1) {
			compGuess = "rock";
		} else if (compNum == 2) {
			compGuess = "paper";
		} else {
			compGuess = "scissors";
		}
		
		if (userGuess.equals(compGuess)) {
			result = "USER:" + userGuess + " vs COMP:" + compGuess + " it is a draw";
		} else if (userGuess == "rock" && compGuess == "scissors") {
			result = "USER:" + userGuess + " vs COMP:" + compGuess + " user wins";
		} else if (userGuess == "paper" && compGuess == "rock") {
			result = "USER:" + userGuess + " vs COMP:" + compGuess + " user wins";
		} else if (userGuess == "scissors" && compGuess == "paper") {
			result = "USER:" + userGuess + " vs COMP:" + compGuess + " user wins";
		} else {
			result = "USER:" + userGuess + " vs COMP:" + compGuess + " COMPUTER wins";
		}
		
		return result;
		
	}
}
