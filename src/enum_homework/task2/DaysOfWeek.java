package enum_homework.task2;

import java.time.DayOfWeek;

public enum DaysOfWeek {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

   private DaysOfWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int numberOfDay;
    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public static void main(String[] args) {
        DayOfWeek tuesday = DayOfWeek.TUESDAY;
        System.out.println(tuesday);
        System.out.println(TUESDAY.numberOfDay);
    }
}
