package enum_homework2.task6;

import java.util.Scanner;

import static enum_homework2.task6.Topping.*;

public enum PizzaSize {
    SMALL(5.5), MEDIUM(7.5), LARGE(9.75);

    double PRICE;

    PizzaSize(double PRICE) {
        this.PRICE = PRICE;
    }

    public double getPRICE() {
        return PRICE;
    }

    public void setPRICE(double PRICE) {
        this.PRICE = PRICE;
    }




    /**
     * calculate pizzas purchase
     * @return the cost of pizza with toppings
     */
//    public static double purchasePizza(){
//        if (sizeNumber == 0 ){
//            paycheck +=  SMALL.getPRICE();
//            System.out.println(paycheck);
//        }
//       else if (sizeNumber == 1) {
//            paycheck += MEDIUM.getPRICE();
//            System.out.println(paycheck);
//        }else if (sizeNumber == 2){
//           paycheck += LARGE.getPRICE();
//            System.out.println(paycheck);
//        }
//        addTopping();
//
//       return paycheck;
//
//
//    }

    /**
     *
     * @return the purchase amount
     */
    public static void purchaseSize(){
        if (sizeNumber == 0 ){
            paycheck +=  SMALL.getPRICE();
            System.out.println(paycheck);
        }
        else if (sizeNumber == 1) {
            paycheck += MEDIUM.getPRICE();
            System.out.println(paycheck);
        }else if (sizeNumber == 2){
            paycheck += LARGE.getPRICE();
            System.out.println(paycheck);
        }

     //   System.out.println(paycheck + toppingsOverall);
    }

    public static void purchaseFinal(){
        double final1 = 0;
        if (toppingQuantity == 0 ){
            final1 = ( toppingsOverall += OPTION1.COST);
            System.out.println(final1 + paycheck);
        } else if (toppingsOverall == 1) {
           final1 = ( toppingQuantity += OPTION2.COST);
            System.out.println(final1 + paycheck);
        } else if (toppingsOverall == 2) {
            final1 = (toppingQuantity += OPTION3.COST);
            System.out.println(final1 + paycheck);
        }else if (toppingsOverall == 3){
            final1 = (toppingQuantity += OPTION4.COST);
            System.out.println(final1 + paycheck);
        } else if (toppingsOverall == 4) {
            final1 = (toppingQuantity += OPTION5.COST);
            System.out.println(final1 + paycheck);
        }
    }



   static Scanner scanner = new Scanner(System.in);
    static double toppingsOverall = 0;
    static double paycheck = 0;
    static int toppingQuantity = scanner.nextInt();
    static int sizeNumber = scanner.nextInt();

    public static void main(String[] args) {
        purchaseSize();
        purchaseFinal();
    }
}