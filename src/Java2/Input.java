package Java2;

import java.util.Scanner;

/**
 * Created by micahdisney on 5/17/17.
 */
public class Input {
    private Scanner scanner = null;


    public Input(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter some words here please: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Would you like to see a summary of your answers?");
        String userInput = this.scanner.next();
        if ("Y".equalsIgnoreCase(userInput)){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Enter any integer between 1-10: ");
        int userInput = this.scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }else{
            System.out.println("Try again. Your number needs to be between " + min + " and " + max);
            getInt(min, max);
            return 0;
        }
    }

    public int getInt(){
        System.out.println("Enter any integer you want: ");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter any decimal number between 1-10: ");
        double userInput = this.scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Try again. Your number needs to be between " + min + " and " + max);
            getDouble(min, max);
            return 0;
        }
    }

    public double getDouble() {
        System.out.println("Enter a decimal number between 1-10");
        return this.scanner.nextDouble();
    }




}
