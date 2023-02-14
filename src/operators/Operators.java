package operators;

public class Operators {
    //Arithmetic operators

   static int a = 8;
   static int b = 6;
   static double c = 6.4;
   static double d = 0.03;
    static int x =   2 * ((5 + 3)*4 - 8);
    static int y = 2 * 5 + 3 * 4 - 8;

    static int e = 10;
    static int f = -88;
    static boolean n1 = true;

   static int xx = 3;
   static int yy = ++xx *5 / xx-- + --xx;

   static int x1 = (int)1.0;
    static short y1 = (short)1921222;

    static long y2 = (x=3);
    static boolean aaa = false;
    static boolean bbb = (aaa = true);
    static int aa = 10;
    static int bb = 20;
    float ff = 2.1f;
    byte x5 = 5;
    byte y5 = 10;
    byte z5 = (byte) (x5 + y5);

    short x4 = 10;
    short y4 = 3;
    int z4 = x * y4;

    /**
     *
     * @param n
     * @return num of first 100 nums
     */
    public static int sumOfNums(int n){
        return n*(n+1)/2; //input 100
    }

    static int A ;
    static int B;

    static int myNumbA;
    static int myNumbB;

    public static void main(String[] args) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);

        System.out.println(x);
        System.out.println(y);

        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        System.out.println("xx is " + xx);
        System.out.println("yy is " + yy);

        System.out.print(2147483647+1);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(aaa);
        System.out.println(bbb);

        System.out.println(aa < bb);
        System.out.println(aa <= bb);
        System.out.println(a >= b);
        System.out.println(a > b);

        int first = 10;
        int second = 5;
        int third = first;
         first = second;
         second = third;

        int number1 = 10;
        int number2 = 5;
        number1 -= number2;
        number2 *= 2;

        System.out.println(sumOfNums(100));
        System.out.println(A & B);
        System.out.println(A ^ B);
        System.out.println(A | B);
        System.out.println(~A);
        System.out.println( true || (A < 4));
        System.out.println( (B >= 6) || (++A <= 7));
        System.out.println((A<B)?A:B);
        System.out.println(B^B);

        System.out.println(10<<2);
        System.out.println(-10<<3);
        System.out.println(20>>2);
        System.out.println(15>>3);

        System.out.println(myNumbA<<3);
        System.out.println(myNumbB<<4);
    }
}
