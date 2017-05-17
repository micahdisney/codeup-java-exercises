package Java2;

import java.util.Scanner;

/**
 * Created by micahdisney on 5/17/17.
 */
public class InputTest {

    private static Scanner scanner;

    public static void main(String[] args) {

        Input userInput = new Input(scanner);


        String userWords = userInput.getString();
        System.out.println(userWords);

        int integerOneTen = userInput.getInt(1, 10);
        System.out.println(integerOneTen);

        int anyNumber = userInput.getInt();
        System.out.println(anyNumber);

        double doubleOneTen = userInput.getDouble(0.00, 10.00);
        System.out.println(doubleOneTen);

        double anyDouble = userInput.getDouble();
        System.out.println(anyDouble);

        boolean wantToContinue = userInput.yesNo();
        System.out.println(wantToContinue);

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
