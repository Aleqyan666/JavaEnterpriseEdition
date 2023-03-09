package exceptions_homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class EMain1 {
    Exception ee = new Exception("You should have entered number more than 0");

    //task 1

    /**
     * find reciprocal of the even number by catching the appropriate exception
     */
    public static void divideByZeroExperiment(){
        try{
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int output = 1 / number1;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You shouldn't divide a number by zero");
        }
    }
    //task2

    /**
     * Write a program that accepts an array of integers from the user and
     * calculates the sum of its elements. If the user enters a non-integer value, the
     * program should throw an exception and print an error message.
     */
    public static void checkTypeOfArrayMember(int ... va ){
       int [] myArray = Arrays.stream(va).toArray();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println(sum);
    }

    //task3

    /**
     * Write a program that reads two numbers from the user and divides them. If
     * the user enters 0 as the second number, the program should throw an
     * exception and print an error message.
     */
    public static void divideAndCheck(){
        try {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int division = first/second;
            System.out.println("output is : " + division);
        }catch (ArithmeticException a){
            System.out.println("you shouldn't divide a number by 0");
        }
    }

    //task4

    /**
     * Write a program that reads a file name from the user and prints its contents
     * to the console. If the file does not exist or cannot be opened, the program
     * should throw an exception and print an error message
     */
    public static void fileCheck(){}

    //task5
    public static void squareRootCheck(){
        try {
            Exception exception = new Exception("the number is  invalid or negative");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            Double squareRoot = Math.sqrt(number);
            System.out.println(squareRoot);
            if (number < 0){
                throw exception;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("GoodBye!");
        }

    }

    //task6

    /**
     *Create three new types of exceptions. Write a method that throws all three. In main( ),
     call the method but only use a single catch clause that will catch all three types of
     exceptions.
     * @throws ClassCastException
     * @throws ArrayStoreException
     * @throws EnumConstantNotPresentException
     */
    public static void createExceptions ()
            throws ClassCastException, ArrayStoreException, EnumConstantNotPresentException  {}

    //task7

    /**
     *Write a program that prompts the user to enter their age. If the user enters an age that is
     negative or greater than 120, the program should throw an exception and print an error
     message
     */
    public void checkAgeValidity(){
        Scanner scanner = new Scanner(System.in);
        Exception myException = new Exception("invalid age!");
        int age = scanner.nextInt();
        try {
            if ((age < 0) && (age > 120)){
                throw myException;
            }
        }catch (Exception a){
            System.out.println(myException);
        }

    }

    //task9
    public void determineQuotient(){

        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int number2 = scanner.nextInt();
            int quotient = number/number2;
            if (number2 <= 0 ){
                System.out.println(ee);
            }
            System.out.println(quotient);
        }catch (Exception exception){
            System.out.println("You should have entered number more than 0");
        }
    }
    public static void main(String[] args) {
      //divideByZeroExperiment();
       // checkTypeOfArrayMember(5,6,7,8);
       // divideAndCheck();
       // squareRootCheck();
        try {
            createExceptions();
        }catch (Exception e){
            System.out.println("caught all three exceptions");
        }
    }
}
