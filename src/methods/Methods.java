package methods;

public class Methods {
    /**
     * Write a method which  .has two input parameters  type  int and return 0.
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    public  int inputIntegers(int firstNumber, int secondNumber){
        return 0;
    }

    /**
     *Write a method which has  not input parameters   and returns nothing.
     *
     */
    public void returnNothing(){}

    /**
     *Write a method which .has a boolean input parameters  and print “Hello World”.
     * @param h7
     * @param h8
     */
    public void printSome(boolean h7, boolean h8){
        System.out.println("Hello World");
    }

    /**
     *Write a method which  .has a char input parameter  and return this  input parameter.
     * @param aLetter
     * @return
     */
    public char returningChars(char aLetter){
        return aLetter;
    }

    /**
     * Write a method which  .has  two float input parameters  and return  one of them.
     * @param firstFloat
     * @param secondFloat
     * @return
     */
    public float returningFloats(float firstFloat, float secondFloat){
        return secondFloat;
    }

    /**
     * Write a method which  .has call itself inside body(recursion)
     */
    public void myRecursion(){
        myRecursion(); //method calling itself
    }

}
