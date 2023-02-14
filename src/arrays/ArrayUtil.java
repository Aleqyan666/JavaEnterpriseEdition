package arrays;

import java.util.*;


public class ArrayUtil {
    /**
     * returning positive elements of the given array
     * @param n
     */
        public static void positiveElements(int []n){
        for (int i = 0; i <= n.length; i++){
            if (n[i] > 0){
                System.out.print(n[i] + " ");
            }
        }
    }

    /**
     * print the elements of the given array in reversed order
     */
        public static void reverseElementsOrder(){
            short []s = {2,5,2,10,18,85};
            for (int i = s.length-1; i >= 0; i--){
                System.out.print(s[i] + " ");
            }
        }

    /**
     * returning largest element of the given array
     */
        public static void printingLargestElement(){
            long []L = new long[]{988,8228,81,18188,1188100,18};
            Arrays.sort(L);
            System.out.println(L[L.length-1]);
        }

    /**
     * returning smallest element of the given array
     */
    public static void printingSmallestElement(){
            float []F = new float[]{1.2f,86.42f,8488.5f,0.2f,11111.5f};
            Arrays.sort(F);
            System.out.println(F[0]);
        }



    /**
     * sum of elements of 2 arrays added in the 3rd array
     */
    public static void gettingSumArray(){
       int [] array1 = new int[]{1,5,6,4,7};
       int [] array2 = new int[]{7,4,2,3,5};
       int [] last = new int[10];

       for (int i = 0; i <= array2.length-1; i++){
           last[i] = array1[i] + array2[i];
           System.out.println(last[i]);
       }
    }

    /**
     * return how many times 'k' appeared in your array
     * @param k
     */
    public static void countMatches(int k){
        int [] theArray = new int[]{115,36,478,2548,6523,51,2363};
        int match = 0;
        for (int i = 0; i <= theArray.length-1; i++){
            if (theArray[i] == k){
                match++;
            }
        }
        System.out.println(match);
    }

    /**
     * descending order of array
     */
    public static void reverseOrderArray(){
        Integer [] H =  {555,56,24,78,961,245};
        Arrays.sort(H, Collections.reverseOrder());
        for (int i = 0; i <= H.length-1; i++){
            System.out.print(H[i] + " ");
        }
    }

    /**
     * change the array in a way when odd numbers come after even ones
     */
    public static void sortEvenOdd(){
        int [] G = new int[] {115,59,364,254,214,369695,88,6};
        int [] OVERALL = new int[G.length];
        for (int i = 0; i <= G.length-1; i++){
            if (G[i] % 2 == 0){
                OVERALL[i] += G[i];
                System.out.print(OVERALL[i] + " |");
            }
        }
        for (int j = 0; j <= G.length-1; j++){
            if (G[j] % 2 == 1){
                OVERALL[j] += G[j];
                System.out.print(OVERALL[j  ] + " |");
            }
        }

    }


    public static void removingZeroes(){
        int [] R  = new int[] {77,88,66,55,0,0,22,0,33,0,11,0,121,0,0};
        int [] serious = new int[R.length];

        for (int i = 0; i <= R.length-1; i++){
            if (R[i] != 0){
                serious[i] += R[i];
                System.out.println(serious[i] + " /");
            }
        }
    }

    /**
     * if the sum of elements of each row is 0 print 'yes' otherwise 'no'
     */
        public static void sumOfMatrix() {
            int sum = 0;
            int[][] A = new int[][] { {1,-1,0,0}, {2,-2,1,-1},{9,7,1,-17}};
            for (int i = 0; i <= A.length-1; i++){
                for (int j = 0; j <= 3; j++){
                    sum += A[i][j];
                }
            }
            if (sum == 0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

        public static void printAboveDiagonal(){
            int array [][] = { {10,11,12,13},
                    {14,15,16,17},
                    {40,41,42,43},
                    {45,46,47,48} };

            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){
                    if (i + j < 3) {
                        System.out.println(array[i][j]);
                    }
                }
            }
        }

        public static void reverseAboveDiagonal(){
            int array [][] = {  {10,11,12,13},
                                {14,15,16,17},
                                {40,41,42,43},
                                {44,45,46,47} };
            int reserve [][] = new int[array.length][array.length];
            for (int i = array.length-1; i > 0; i--){
                for (int j = array.length -1; j > 0 ; j--){
                    if (i + j > 3){
                        reserve[i][j] += array[i][j];
                        System.out.println(reserve[i][j]);
                    }
                }
            }
            for (int k = 0; k < array.length; k++){
                for (int h = 0; h < array.length; h++){
                    if (h + k == 3){
                        reserve[k][h] += array[k][h];
                        System.out.println(reserve[k][h]);
                    }
                }
            }
            for (int l = 0; l < array.length ; l++){
                for (int p = 0; p < array.length; p++ ){
                    reserve[l][p] += array[l][p];
                    System.out.println(reserve[l][p]);
                }
            }
        }

    /**
     * convert from binary to decimal
     */
    public static void decimalBinaryConversion(){
            Scanner sc = new Scanner(System.in);
            int decimalNumber = 0, i = 0;
            int remainder;
            Integer number = sc.nextInt();
            number.toString().toCharArray();
            System.out.println(number);
            while (number != 0) {
                remainder = number % 10;
                number /= 10;
                decimalNumber += remainder * Math.pow(2, i);
                ++i;
            }

            System.out.println(decimalNumber);
        }

    /**
     * printing longest increase of subsequent elements of array
     */
    public static void longestIncrease(){
        List myList = new LinkedList<>();
      int reserve = 0 , row = 0;
      int [] T = new int[]{1,5,6,4,9,0,4,7,7,9, 1};
      for (int i = 0; i < T.length; i++){
          if (T[i] >= reserve){
              reserve = T[i];
              myList.add(T[i]);
              row = myList.size();
              System.out.println(myList + " LIST SIZE : " + row);
          }else{
              reserve = 0; row = 0;
              myList.clear();
              System.out.println(myList);
          }
      }
       for (int j = 0; j < myList.size(); j++){
           System.out.println(myList);
       }
    }

    /**
     *printing subarrays consisting of 3 elements
     */
//TODO    public static void subarraysWith3Elements(){
//        int [] array = new int[] {1,2,3,4,5,6};
//        for (int i = 0; i < array.length; i++){
//            for (int j = i; j < array.length; j++){
//                for (int k = j; k <= j; j++){
//                    System.out.println(array[k]);
//                }
//                System.out.println();
//            }
//        }
//    }


    public static void main(String[] args) {

       //TODO subarraysWith3Elements();


        longestIncrease();
        reverseAboveDiagonal();
        sumOfMatrix();
        removingZeroes();
        sortEvenOdd();
        reverseOrderArray();
        gettingSumArray();
        reverseElementsOrder();
        printingLargestElement();
        printingSmallestElement();
        decimalBinaryConversion();
    }
}
