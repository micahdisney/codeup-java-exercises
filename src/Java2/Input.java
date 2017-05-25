package Java2;

import java.util.Scanner;

/**
 * Created by micahdisney on 5/17/17.
 */

public class Input {

    private Scanner scanner;


    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = this.getString();

        if ("Y".equalsIgnoreCase(userInput)){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(){
        try {
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.print("Please enter an integer: ");
            return getInt();
        }
    }


    public int getInt(int min, int max){
        int num;
        try {
            String possibleNumber = this.getString();
            num = Integer.valueOf(possibleNumber);
        } catch (NumberFormatException e) {
            System.out.print("Please enter *an integer* between " + min + " and " + max + ": ");
            return getInt(min, max);
        }

        if(num >= min && num <= max){
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getInt(min, max);
    }


    public double getDouble() {
        return scanner.nextDouble();
    }


    public double getDouble(double min, double max){
        double num = this.getDouble();
        if(num >= min && num <= max){
            return num;
        }
        System.out.println(num + " number out of range, try again");
        return getDouble(min, max);

    }


    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("Please enter a number between 0-10: ");
        int userInput = input.getInt(0, 10);
        System.out.println("Your number is: " + userInput);
    }



}
