import java.util.Scanner;

/**
 * Created by micahdisney on 5/11/17.
 */

//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.


public class BobResponse {
    public static void main(String[] args) {
        String question = "Sure.";
        String yelledAt = "Woah, chill out!";
        String nothing = "Fine. Be that way!";
        String whatever = "Whatever";

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        String response = sc.nextLine();


        if (response.endsWith("?")) {
            System.out.println(question);
        } else if (response.toUpperCase().equals(response)) {
            System.out.println(yelledAt);
        } else if (response.endsWith("!")) {
            System.out.println(yelledAt);
        } else if (response.trim().equals("")) {
            System.out.println(nothing);
        } else {
            System.out.println(whatever);
            }



        }
    }
