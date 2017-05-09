package io;

/**
 * Created by micahdisney on 5/8/17.
 */

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int integer = sc.nextInt();
    System.out.println("Your integer is " + integer);



    System.out.println("Enter three words: ");
    String firstWord = sc.next();
    String secondWord = sc.next();
    String thirdWord = sc.next();
    sc.nextLine();
    System.out.println("Three words are " + firstWord + ", " + secondWord + ", " + thirdWord);



    System.out.println("Enter a sentence: ");
    String sentence = sc.nextLine();
    System.out.println("Sentence: " + sentence);

    System.out.println("What is the length of the classroom?");
    double length = Double.parseDouble(sc.next());
    System.out.println("What is the width of the classroom?");
    double width = Double.parseDouble(sc.next());
    System.out.println("area = " + length*width);
    System.out.println("perimeter = " + ((2*length) + (2*width)));



    }
}