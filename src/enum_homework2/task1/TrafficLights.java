package enum_homework2.task1;

public enum TrafficLights {
    RED(0,"red"), YELLOW(1,"yellow") , GREEN(2,"green");

    int ID;
    String COLOR;

    TrafficLights(int ID, String COLOR) {
        this.ID = ID;
        this.COLOR = COLOR;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }



    public void changeState() {
        if (getCOLOR() == "red"){
            setCOLOR("yellow");
            System.out.println(COLOR.toUpperCase());
        }else if (getCOLOR() == "yellow"){
            setCOLOR("green");
            System.out.println(COLOR.toUpperCase());
        } else if (getCOLOR() == "green") {
            setCOLOR("red");
            System.out.println(COLOR.toUpperCase());
        }
    }

    public static void main(String[] args) {
        TrafficLights red = TrafficLights.RED;
        System.out.println(red);
        red.changeState();

    }
}
