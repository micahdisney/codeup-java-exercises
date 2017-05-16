package Java1;

/**
 * Created by micahdisney on 5/8/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString = "This is my string.";
        System.out.println(myString);

//        String myString = 'A';
//        System.out.println(myString);

        //does not work

//        String myString = 3.14;
//        System.out.println(myString);

        // does not work

//        long myNumber;
//        System.out.println(myNumber);

        //does not work

//        long myNumber = 3.14;
//        System.out.println(myNumber);

        //does not work

//        long myNumber = 123L;
//        System.out.println(myNumber);

        //does not work

        long myNumber = 123;
        System.out.println(myNumber);

//        float myNumber = 3.14;
//        System.out.println(myNumber);

        //does not work

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //one does the addition before the number and one does it after.

//        String class = "class";
//        System.out.println(class);

        //doesnt work

//        int x = 4;
////        x = x + 5;
//        x += 5;
//        System.out.println(x);




//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//        System.out.println(y);
//
//
        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);


    }

}