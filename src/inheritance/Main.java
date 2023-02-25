package inheritance;

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
