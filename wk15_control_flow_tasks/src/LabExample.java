/**
 * 
 * @author Melanie
 * This is the LabExample class - used to explore if and loop statements
 * 
 */

public class LabExample {

	//Task 1
	
	public int highestOfTwo(int number1, int number2) {
		if(number1 > number2) {
			return number1;
		} else if (number1 < number2) {
			return number2;
		} else {
			return -1;
		}
		
	}
	
	//Task 2
	
	public String calculateGrade(int mark) {
		String grade = "";
		if(mark < 0 || mark > 100 ) {
			grade = "Invalid mark";
		} else if(mark < 40) {
			grade = "Fail";
		} else if(mark < 50 ) {
			grade = "3rd";
		} else if(mark < 60) {
			grade = "2ii";
		} else if(mark < 70) {
			grade = "2i";
		} else if(mark >= 70 && mark < 100) {
			grade = "1st";
		}
		return grade;
	}
	
	//Task 3
	
	public String headsOrTails(String guess) {
		int result = 0;
		if(guess.equals("heads") && result == 0) {
			return "Correct: you guessed heads and I flipped heads";
		} else if (guess.equals("tails") && result == 1) {
			return "Correct: you guessed tails and I flipped heads";
		} else {
			return "Incorrect: you guessed heads and I flipped tails";
		}
	}
	
	//Task 4
	
	public int sumFromOneToWhat(int top) {
		int sum = 0;
		for( int i = 1; i <= top; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	//Task 5
	
	public int sumFromWhatToWhat(int num1, int num2) {
		int top = 0;
		int bottom = 0;
		if(num1 > num2) {
			top = num1;
			bottom = num2;
		}else {
			top = num2;
			bottom = num1;		
		}
		int sum = 0;
		for( int i = bottom; i <= top; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
