package inheritance;

public class Truck extends Car{
    public Truck(int capacity) {
        this.capacity = capacity;
    }

    private int capacity ;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}