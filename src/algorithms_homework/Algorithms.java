package algorithms_homework;
import java.util.Random;

public class Algorithms {
    /**
     *
     * @param number
     * @return largest prime factor of a given number.
     */
    //
    public static void largestPrimeFactor(long number) {
        int j;
        long myNumber = number;
        for (j = 2; j <= myNumber; j++) {
            if (myNumber % j == 0) {
                myNumber /= j; j--;
            }
        }
        System.out.println(j);
    }

    //the same method with int return type
//    public static int largestPrimeFactor(long number) {
//        int j;
//        long myNumber = number;
//        for (j = 2; j <= myNumber; j++) {
//            if (myNumber % j == 0) {
//                myNumber /= j; j--;
//            }
//        }
//        return j;
//    }

    /**
     * check whether the number is odd or even, return the random number
     * @param number
     */
    public static void generateRandomNumber(int number){
        Random randomNumber = new Random();
        int pick = randomNumber.nextInt(number);
        System.out.println("***********");
        if (pick % 2 == 0 ){
            System.out.println("Your pick is even");
        }else{
            System.out.println("Your pick is odd");
        }
        System.out.println(pick);
    }

    /**
     * write a method that returns true if it is
     * possible to make a package with goal kilos of rice.
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static boolean riceBags(int x, int y, int z){
        boolean answer = false;
        if (x*5 >= z){
            if (y >= x % 5){
                answer = true;
            }else if (y >= z - x*5){
                answer = true;
            }
        }
        return true;
    }
//TODO
//       public static void smallestAndLargest(int quantity){
//            Random random2 = new Random();
//            int k = 0;
//            int number = 0;
//TODO
//           while(k < 10){
//               Integer pick = random2.nextInt(quantity);
//               System.out.print(pick + " ");
//               number = pick;
//               k++;
//               if ()
//           }
//       }



    public static void main(String[] args) {
        largestPrimeFactor(18);
        largestPrimeFactor(891884749);
        largestPrimeFactor(123);

        generateRandomNumber(12);
//        smallestAndLargest(11);




    }

}