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


        for(int i = 1 ; i <= 100 ; ++i){
            if(i % (5 * 3) == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }



    }
}
