package Java2;

import java.util.Scanner;

/**
 * Created by micahdisney on 5/17/17.
 */
public class InputTest {

//    private static Scanner scanner;

    public static void main(String[] args) {

        Input userInput = new Input();

        System.out.println("Enter some words here please: ");
        String userWords = userInput.getString();

        System.out.println("Please enter an integer between 1-10: ");
        int integerOneTen = userInput.getInt(1, 10);

        System.out.println("Enter any integer you want: ");
        int anyNumber = userInput.getInt();

        System.out.println("Enter any decimal number between 1-10: ");
        double doubleOneTen = userInput.getDouble(0.00, 10.00);

        System.out.println("Enter any decimal number you want: ");
        double anyDouble = userInput.getDouble();

        System.out.println("Would you like to see a summary of your answers? ");
        userInput.yesNo();

        System.out.println("");
        System.out.println("Here are all of your answers: ");
        System.out.println("=============================");
        System.out.println("your sentence: " + userWords);
        System.out.println("your integer: " + anyNumber);
        System.out.println("your integer between 1-10: " + integerOneTen);
        System.out.println("your decimal number: " + anyDouble);
        System.out.println("your decimal number between 1-10: " + doubleOneTen);

    }
}
