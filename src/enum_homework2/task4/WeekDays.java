package enum_homework2.task4;

import abstract_Interface.Main;

import java.util.Scanner;

public enum WeekDays {
    MONDAY(1) ,TUESDAY(2) ,WEDNESDAY(3) ,THURSDAY(4)
    ,FRIDAY(5) ,SATURDAY(6) ,SUNDAY(7);



    int DAY_INDEX;

    WeekDays(int DAY_INDEX) {
        this.DAY_INDEX = DAY_INDEX;
    }

    public int getDAY_INDEX() {
        return DAY_INDEX;
    }

    public void setDAY_INDEX(int DAY_INDEX) {
        this.DAY_INDEX = DAY_INDEX;
    }

    static Scanner scanner = new Scanner(System.in);
     static int dayOfWeek = scanner.nextInt();

    public static void validate(){
        if ( 1 <= dayOfWeek && dayOfWeek <=5 ){
            System.out.println("WeakDay");

        }else{System.out.println("WeekEnd");}
    }

    public static void main(String[] args) {
        validate();
    }
}
