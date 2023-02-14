package statements;

public class Statements {

    /**
     * whether num is even or not
     * @param n
     */
    public void isEven(int n){
        if(n % 2 == 0){
            System.out.println("is even");
        }
    }

    /**
     * determine the sign of my number
     * @param n
     */
    public void checkSign(int n){
        if (n < 0){
            System.out.println("N is negative");
        }else{
            System.out.println("N is positive");
        }
    }

    /**
     * checking the range of my num
     * @param n
     */
    public void somethingEasy(int n){
        if ((n < 8 && n > 5) || (n < 20 && n > 15)){
            System.out.println("Hello");
        }
    }
    public void isMultipleOf(int n){
        if(n % 35 == 0){
            System.out.println("My number is multiple of 35");
        }
    }

    public void isSeven(int n){
        if ((n > 99 && n < 1000) && ((n /10 )% 10 == 7 )){
            System.out.println("The second digit of your num is 7");
        }else{
            System.out.println("Surprise");
        }
    }

    /**
     * determine the biggest number out of those
     * @param a
     * @param b
     * @param c
     */
    public void theGreatest(int a, int b, int c){
        if (a > b && a >c){
            System.out.println("a is the greatest");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest");
        } else if (c > a && c > b) {
            System.out.println("c is the greatest");
        }
    }

    public void nahanjTari(int year){
        if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0){
            System.out.println("NAHANJ TARI!!!");
        }else{
            System.out.println("An ordinary yearr");
        }
    }

    public void isPointInside(int radius, int x0, int y0){
        if( ((x0 -0)^2) + ((y0-5)^2) < (radius*radius)){
            System.out.println("lays inside");
        }// ete = en(on circle) ete > outside
    }

    public void printNumbers(int N){
        for(int i =1; i <= N; i++){
            System.out.println(i);
        }
    }

    public static int sumOfMultiplesFive(int N){
        int mySum = 0;
        for (int i = 1; i <= N; i++){
            if (i % 5 == 0){
                mySum += i;
            }
        }
        System.out.println(mySum);
        return mySum;
    }



    public void getTheFirstDigit(int number){
        System.out.println(number % 10);
    }

    /**
     * average of smallest and biggest elements
     * @param N
     * @return
     */
    public int averageOfTwoNumbers(int N){
        return (1+N)/2;
    }

    public long multiplyOfNumber(int N, int overall){
        for (int i = 10; i <= N; i++){
            if (N < 100 && N > 9 && N % 2 ==0){
                overall *= i;
            }
        }
        return overall;
    }

    public int sumOfDigits(int number){
        if (number > 9999 && number < 100000){
        }
        return (number % 10) + ((number/10)%10) + ((number/100)%10) + ((number/1000)%10)  + number/10000;
    }

    public static void squareAsterisks(int n) {
        String asterisk = "*";
        for(int i = 1; i < n; i++){
            asterisk = asterisk + " *";
        }
        for (int j = 0; j < n; j++){
            System.out.println(asterisk);
        }
    }
    //98752
    public static void main(String[] args) {


        int myNum = 0;
        while (myNum++ < 10) {
            if (myNum == 8){
                break;
            }
        }
        System.out.println(myNum);

        int x = 15;
        while (x > 10) {
            x-- ;
        }
        System.out.println(x);



//        int myX = 1;
//        int myY = 0;
//        while (myX <5 && myY<10) {
//            System.out.println(myX + myY);
//         }


        squareAsterisks(8);

        }

    }
//infinite cycle, x must increase to close the loop
//    int x = 2;
//    int y = 5;
//         while(x < 10) {
//        y++;
//    }


