package enum_homework2.task3;

public enum Planet {
    MERCURY(68.2,"Mercury",2882000),
    VENUS(68.2,"Venus",2882000),
    EARTH(68.2,"Earth",2882000),
    MARS(68.2,"Mars",2882000),
    JUPITER(68.2,"Jupiter",2882000),
    SATURN(68.2,"Saturn",2882000),
    URANUS(68.2,"Uranus",2882000),
    NEPTUNE(68.2,"Neptune",2882000);

    double MASS;
    String NAME;
    double DISTANCE; // distance from the Sun in MILES

    Planet(double MASS, String NAME, double DISTANCE) {
        this.MASS = MASS;
        this.NAME = NAME;
        this.DISTANCE = DISTANCE;
    }

    public double getMASS() {
        return MASS;
    }

    public void setMASS(double MASS) {
        this.MASS = MASS;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public double getDISTANCE() {
        return DISTANCE;
    }

    public void setDISTANCE(double DISTANCE) {
        this.DISTANCE = DISTANCE;
    }

    /**
     * displays the name and the mass of the planet
     */
    public void showDetails(){
        System.out.println("Name " + getNAME() + " / Mass = " + getMASS() + "tonnes");
    }

    public static void main(String[] args) {
        MARS.showDetails();
    }
}
