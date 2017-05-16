package Java1;

import java.util.Scanner;

/**
 * Created by micahdisney on 5/9/17.
 */


public class ControlFlowExercises {
    public static void main(String[] args) {
////        int i = 5;
////        while (i <= 15) {
////            System.out.println(i);
////            i++;
////        }
//
//        for(int i = 5; i <= 15; i++)
//        {
//            System.out.println(i);
//        }
//
////        int j = 0;
////        do {
////            {
////                System.out.println(j++);
////            }
////        } while (j++ <= 100);
//
//
//        int j;
//        for(j=0; j<=98; ) {
//            j = j + 2;
//            System.out.println(j);
//        }
//
////        int k =105;
////        do{
////            k=k-5;
////            System.out.println(+k);
////        }
////        while (k > -10);
//
//
//        int k;
//        for(k=105; k> -10; ) {
//            k = k - 5;
//            System.out.println(k);
//        }
//
//
////        int l = 2;
////        do{
////            l = l*l;
////            System.out.println(+l);
////        }
////        while (l < 65536);
//
//        int l;
//        for(l = 2; l < 65536;) {
//            l = l * l;
//            System.out.println(l);
//        }


//        for(int i = 1 ; i <= 100 ; ++i){
//            if(i % (5 * 3) == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else
//                System.out.println(i);
//        }


//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        String yesNo = "Y";
//
//        do
//        {
//            System.out.print("What number would you like to go up to? ");
//            int userNumber = sc.nextInt();
//            System.out.print("\n ");
//            System.out.print("Here is your table!\n ");
//            System.out.print("\n ");
//
//
//            String colTitles = " Number  |  " + "Squared  | " + " Cubed   " + "\n"
//                    +   "-------- | " + "--------- |" + " -------   ";
//            System.out.println(colTitles);
//
//            int squared = 0;
//            int cubed = 0;
//
//            String row = "";
//
//            for (int i = 1; i <= userNumber; i++)
//            {
//
//                squared = i * i;
//                cubed = i * i * i;
//
//                row = "    "+ i + "    |    "+ squared + "      |    "+ cubed;
//                System.out.println(row);
//            }
//
//            System.out.print("Would you like to continue? (Y/N): ");
//            yesNo = sc.next();
//            System.out.println();
//
//        }
//        while (!yesNo.equalsIgnoreCase("N"));


        System.out.println();

        Scanner sc = new Scanner(System.in);
        String yesNo;

        do {
            System.out.print("Enter your numerical grade to get letter grade:  ");
            int userNumber = sc.nextInt();

            if (userNumber >= 97) {
                System.out.println("Your grade is: A+");
            } else if (userNumber >= 94) {
                System.out.println("Your grade is: A");
            } else if (userNumber >= 90) {
                System.out.println("Your grade is: A-");
            } else if (userNumber >= 87) {
                System.out.println("Your grade is: B+");
            } else if (userNumber >= 84) {
                System.out.println("Your grade is: B");
            } else if (userNumber >= 80) {
                System.out.println("Your grade is: B-");
            } else if (userNumber >= 77) {
                System.out.println("Your grade is: C+");
            } else if (userNumber >= 74) {
                System.out.println("Your grade is: C");
            } else if (userNumber >= 70) {
                System.out.println("Your grade is: C-");
            } else {
                System.out.println("Your grade is: F");
            }


            System.out.print("Would you like to enter another grade? (Y/N): ");
            yesNo = sc.next();
            System.out.println();

        }
        while (!yesNo.equalsIgnoreCase("N")) ;

    }
}
