/**
 * Created by micahdisney on 5/11/17.
 */

import java.util.Scanner;

public class MethodsExercise {


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the first number: ");
//        int x = sc.nextInt();
//        System.out.println("Enter the Second number: ");
//        int y = sc.nextInt();
//
//        int additionAnswer = addition(x, y);
//        System.out.println(x + " + " + y + " = " + additionAnswer);
//
//        int subtractionAnswer = subtraction(x, y);
//        System.out.println(x + " - " + y + " = " + subtractionAnswer);
//
//        int multiplicationAnswer = multiplication(x, y);
//        System.out.println(x + " * " + y + " = " + multiplicationAnswer);
//
//        int divisionAnswer = division(x, y);
//        System.out.println(x + " / " + y + " = " + divisionAnswer);
//
//        int modulusAnswer = modulus(x, y);
//        System.out.println(x + " % " + y + " = " + modulusAnswer);
//
//    }
//
//
//    public static int addition(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtraction(int x, int y) {
//        return x - y;
//    }
//
//    public static int multiplication(int x, int y){
//        return x * y;
//    }
//
//    public static int division(int x, int y){
//        return x / y;
//    }
//
//    public static int modulus(int x, int y){
//        return x % y;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userSelection;
        String yesNo;

        do{
        System.out.println("Enter an integer between 1 and 10: ");
        userSelection = sc.nextInt();
        if (userSelection >= 1 && userSelection <= 10) {
            System.out.println(userSelection);
        }else if (userSelection < 1 || userSelection > 10) {
            System.out.println("That is not between 1 and 10 ");
        }

        System.out.print("Would you like to enter another number? (Y/N): ");
        yesNo = sc.next();
        System.out.println();

        }

        while(!yesNo.equalsIgnoreCase("N"));



    }






}
