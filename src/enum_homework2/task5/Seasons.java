package enum_homework2.task5;

import java.util.Scanner;

public enum Seasons {
    SPRING, SUMMER, FALL, WINTER ;

    static Scanner sc = new Scanner(System.in);
    static int temp = sc.nextInt();

    public static void detectSeasons(){
        if (temp < Integer.MAX_VALUE && temp > 80){
            System.out.println("summer");
        }else if (temp < 80 && temp > 60){
            System.out.println("spring");
        } else if (temp < 60 && temp > 40) {
            System.out.println("fall");
        }else if (temp < 40 && temp > Integer.MIN_VALUE);
        System.out.println("winter");
    }

    public static void main(String[] args) {
        detectSeasons();
    }
}
