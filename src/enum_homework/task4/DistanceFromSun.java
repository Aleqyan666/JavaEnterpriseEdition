package enum_homework.task4;

public enum DistanceFromSun {
    //distance in miles
    MERCURY(35000000) , VENUS(67000000) , EARTH(93000000) , MARS(142000000) ,
    JUPITER(484000000) , SATURN(889000000) , URANUS(1790000000), NEPTUNE(288000000);

    private int distance;

   private DistanceFromSun(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }



    public static void main(String[] args) {
        System.out.println(SATURN.getDistance());
    }
}
