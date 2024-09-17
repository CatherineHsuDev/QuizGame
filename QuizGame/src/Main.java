import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// get user input with a scanner object
		Scanner scanner = new Scanner(System.in);

		// keep track of correct answers and total questions
		int totoalPoints = 0;
		int totalQuestions = 5; // update to the total number of questions

		// Question 1
		System.out.println("1. What is the chemical symbol for water?");
		System.out.println("A. H2O\nB. CO2\nC. O2\nD. NaCl");
		System.out.print("Your answer: ");
		String answer = scanner.nextLine(); // get user input and go to next line
		String correctAnswer1 = "A"; // use a variable to store correct answer
		System.out.println(); // empty line for separation

		if (answer.equalsIgnoreCase(correctAnswer1)) { // compare the answer without case sensitive
			totoalPoints++; // add 1 point to the score
			System.out.println("Answer Correct! Score plus 1");
		} else {
			System.out.println("The correct answer is " + correctAnswer1 + ".\nScore plus 0"); // present the correct answer
																					
		}
		System.out.println("Press enter to the next question");
		scanner.nextLine(); // let user press enter to get ready for next question

		// Question 2
		System.out.println("2. What is the capital of France?");
		System.out.println("A. Berlin\nB. Madrid\nC. Paris\nD. Rome");
		System.out.print("Your answer: ");
		answer = scanner.nextLine();
		String correctAnswer2 = "C";
		System.out.println(); // empty line for separation

		if (answer.equalsIgnoreCase(correctAnswer2)) {
			totoalPoints++;
			System.out.println("Answer Correct! Score plus 1");
		} else {
			System.out.println("The correct answer is " + correctAnswer2 + ".\nScore plus 0");
		}
		System.out.println("Press enter to the next question");
		scanner.nextLine();

		// Question 3
		System.out.println("Question 3: Which planet is known as the Red Planet?");
		System.out.println("A. Earth\nB. Mars\nC. Jupiter\nD. Saturn");
		System.out.print("Your answer: ");
		answer = scanner.nextLine();
		String correctAnswer3 = "B";
		System.out.println(); // empty line for separation

		if (answer.equalsIgnoreCase(correctAnswer3)) {
			totoalPoints++;
			System.out.println("Answer Correct! Score plus 1");
		} else {
			System.out.println("The correct answer is " + correctAnswer3 + ".\nScore plus 0");
		}
		System.out.println("Press enter to the next question");
		scanner.nextLine();

		// Question 4
		System.out.println("Question 4: What is the largest ocean on Earth?");
		System.out.println("A. Atlantic Ocean\nB. Indian Ocean\nC. Arctic Ocean\nD. Pacific Ocean");
		System.out.print("Your answer: ");
		answer = scanner.nextLine();
		String correctAnswer4 = "D";
		System.out.println(); // empty line for separation

		if (answer.equalsIgnoreCase(correctAnswer4)) {
			totoalPoints++;
			System.out.println("Answer Correct! Score plus 1");
		} else {
			System.out.println("The correct answer is " + correctAnswer4 + ".\nScore plus 0");
		}
		System.out.println("Press enter to the next question");
		scanner.nextLine();

		// Question 5
		System.out.println("Question 5: What is the hardest natural substance on Earth?");
		System.out.println("A. Gold\nB. Iron\nC. Diamond\nD. Silver");
		System.out.print("Your answer: ");
		answer = scanner.nextLine();
		String correctAnswer5 = "C";
		System.out.println(); // empty line for separation

		if (answer.equalsIgnoreCase(correctAnswer5)) {
			totoalPoints++;
			System.out.println("Answer Correct! Score plus 1");
		} else {
			System.out.println("The correct answer is " + correctAnswer5 + ".\nScore plus 0");
		}
		System.out.println("Press enter to get your score");
		scanner.nextLine();

		// Calculate the score
		double finalScore = 100 * ((double) totoalPoints / totalQuestions);
		// to ensure the decimal number not missing by declare (double) totoalPoints

		// Display the final score
		System.out.println("\nYour final score: " + finalScore + "%");
		System.out.println("You got " + totoalPoints + " out of " + totalQuestions + " correct.");

		// Close the scanner
		scanner.close();

	}

}
