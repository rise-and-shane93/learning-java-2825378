import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Who won the 2020 NBA Finals";
        String choiceOne = "MIA";
        String choiceTwo = "LAL";
        String choiceThree = "DEN";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");
        // Have the user input an answer
        Scanner input = new Scanner(System.in);

        // Retrieve the user's input
        String studentAnswer = input.next();
        // If the user's input matches the correctAnswer...
        if (studentAnswer.equals(correctAnswer.toUpperCase())) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect :(. The correct answer is " + correctAnswer);
        }


        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
