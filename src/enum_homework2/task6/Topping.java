package enum_homework2.task6;

public enum Topping {
    OPTION1(1.5), OPTION2(0.8), OPTION3(6.2), OPTION4(2.1), OPTION5(1.5);

    double COST;

    Topping(double COST) {
        this.COST = COST;
    }

    public double getCOST() {
        return COST;
    }

    public void setCOST(double COST) {
        this.COST = COST;
    }



}
