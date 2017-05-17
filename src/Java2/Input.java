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
        String userInput = this.scanner.next();
        if ("Y".equalsIgnoreCase(userInput)){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInput = this.scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }else{
            System.out.println("Try again. Your number needs to be between " + min + " and " + max);
            getInt(min, max);
        }
        return getInt();

    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput = this.scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Try again. Your number needs to be between " + min + " and " + max);
            getDouble(min, max);
        }
        return getDouble();
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }




}
