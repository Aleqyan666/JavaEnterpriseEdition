package inheritance;

import inheritance.task1.Child;
import inheritance.task2.SubClass;
import inheritance.task4.Car;
import inheritance.tasks5_7.FordTruck;

public class Main {

    public static void main(String[] args) {
      Child child = new Child();
      child.show();


        SubClass subClass = new SubClass("Hello Parent Class");
        subClass.showMessages();

        Car car = new Car(5,'R');
        car.printingDetails();
        FordTruck fordTruck = new FordTruck(7,'L',10);

    }
}
