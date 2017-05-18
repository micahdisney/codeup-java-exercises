package Java2;

import java.util.Random;
import java.util.Scanner;


/**
 * Created by micahdisney on 5/18/17.
 */
public class NameGenerator {


    public static void main(String[] args) {
        NameGenerator();
    }

    private static String getRandom(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    public static String NameGenerator(){
        String[] adjectives = {"Hip", "Perfect", "Cute", "Smelly", "Ugly", "Tiny", "Important", "Gigantic", "Observant", "Curly"};
        String[] nouns = {"Car", "Sidewalk", "Billboard", "Rock", "Cat", "Sock", "Boat", "Monkey", "Pirate", "Baby"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Type \"random\" to get random name: ");
        String userInput = sc.nextLine();
        System.out.println(getRandom(adjectives) + " " + getRandom(nouns));
        return NameGenerator();
    }
}
