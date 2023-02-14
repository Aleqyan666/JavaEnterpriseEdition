package algorithms2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Algorithm2 {
    /**
     * generate and print the multiplication table of the given positive integer
     *
     * @param number
     */
    public static void multiplicationTable(int number) {
        if (number > 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.print(number * i + " ");
            }
        }
    }

//    public static void reverseNumber(Integer myNumber){
//        for (int i = 0;
//    }

    public static void isPrime(int number) {
        int count = 0;
        if (number > 2) {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

        }
    }


    /**
     * reverses the inputted Integer
     *
     * @param number
     */
    public static void reverseNumber(Integer number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        stringBuilder.reverse();
        System.out.println("Successfully reversed : " + stringBuilder);
    }

    /**
     * Write a program to calculate the sum of following series where n is input
     * 1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n
     *
     * @param number
     */
    public static void fractionsSum(int number) {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
    }

    /**
     * Compute the natural logarithm of 2, by adding up to n terms in the series 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
     *
     * @param n
     */

    public static void computeLogarithmOf2(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.println(sum);
    }


    public static void printingAsteriskLine(int quantity) {
        int start = 0;
        while (start < quantity) {
            start += 2;
            System.out.println("*********");
        }
    }


    public static void printingAscendingAsterisk(int quantity) {
        char asterisk = '*';
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= quantity; i += 2) {
            stringBuilder.append(asterisk);
            System.out.println(stringBuilder);
        }
    }

    public static void printArmstrongNumbers(int limitNumber) {
        int units = 0;
        int tens = 0;
        int hundreds = 0;
        for (int i = 1; i <= limitNumber; i++) {
            if ((0 < i) && (i < 10)) {
                units = i;
                if (i == (units * units * units)) {
                    System.out.println("Armstrong : " + i);
                }
            } else if ((i >= 10 && i < 100)) {
                units = i % 10;
                tens = i / 10;
                if (i == (units * units * units + tens * tens * tens)) {
                    System.out.println("Armstrong : " + i);
                }
            } else if ((i >= 100 && i < 1000)) {
                units = i % 10;
                tens = (i / 10) % 10;
                hundreds = i / 100;
                if (i == (units * units * units + tens * tens * tens + hundreds * hundreds * hundreds)) {
                    System.out.println("Armstrong : " + i);
                }
            }
        }
    }

    public static void printRevAscendingAsterisk(int quantity) {
        char asterisk = '*';
        String line = "";
        for (int i = 0; i <= quantity; i++) {
            for (int j = 0; j <= quantity; j++) {
                if (i < j) {
                    line += asterisk;
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
            line = "";
            System.out.println();
        }
    }

    /**
     * Write a program that generates a random number and asks the user to guess
     * what the number is. If the user's guess is higher than the random number, the
     * program should display "Too high, try again." If the user's guess is lower than
     * the random number, the program should display "Too low, try again." The
     * program should use a loop that repeats until the user correctly guesses the
     * random number
     */
    public static void higherOrLower() {
        Random rRandom = new Random();
        Scanner sScanner = new Scanner(System.in);
        int randomNumber = rRandom.nextInt();
        int guess = sScanner.nextInt();
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            }
        }

    }
//    public static void inputCounter(int LIMIT) {
//        Scanner myScanner = new Scanner(System.in);
//        int number = myScanner.nextInt();
//        int i = 0;
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        while (i < LIMIT) {
//            i++;
//            if (number > 0) {
//                positive++;
//            } else if (number < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//        }
//        System.out.println("Pos : " + positive + " Neg : + " + negative + " Zero : " + zero);
//    }

    public static void largestAndSmallestInput(int limit){
        Scanner sc = new Scanner(System.in);
        ArrayList arrayList = new ArrayList<>();
        int number = sc.nextInt();
        int i = 0;
        while(limit > i){
            arrayList.add(number);
            i++;
        }
        Collections.sort(arrayList);
        System.out.println("Smallest : " + arrayList.get(0) + " Largest : " + arrayList.get(arrayList.size()-1));


    }


    public static void main(String[] args) {

//        inputCounter(5);
        isPrime(997);
        computeLogarithmOf2(10);
        printArmstrongNumbers(500);

        printRevAscendingAsterisk(4);
        printingAsteriskLine(10);
        printingAscendingAsterisk(25);

        fractionsSum(5);
        multiplicationTable(5);
        reverseNumber(280766811);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number: ");
        int number = scanner.nextInt();
        System.out.println("Your power: ");
        int power = scanner.nextInt();
        int initialPower = 1;

        if (power >= 1) {
            for (int i = 1; i <= power; i++) {
                initialPower *= number;

            }

            System.out.println(initialPower);

        }


    }
}