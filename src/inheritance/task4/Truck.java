package inheritance.task4;

public abstract class Truck extends Car {
    public Truck(int passengerCount, char engineType, int capacity) {
        super(passengerCount, engineType);
        this.capacity = capacity;
    }

    @Override
    public void printingDetails() {
        super.printingDetails();
    }

    private int capacity ;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
