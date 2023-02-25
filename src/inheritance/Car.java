package inheritance;

public class Car {
    public Car(int passengerCount, char engineType) {
        this.passengerCount = passengerCount;
        this.engineType = engineType;
    }

    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        }else this.passengerCount = 0;
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        this.engineType = engineType;
    }
    public void printingDetails(){
        System.out.println(getPassengerCount() + " Seats " + " Engine Type -->" + getEngineType());
    }
}
