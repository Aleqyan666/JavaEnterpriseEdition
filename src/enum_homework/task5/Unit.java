package enum_homework.task5;

public enum Unit {
    METER("meter", null),
    KILOGRAM("kilogram", null),
    SECOND("second", null),
    AMPERE("ampere", null),
    KELVIN("kelvin", null),
    MOLE("mole", null),
    CANDELA("candela", null),
    NEWTON("newton", KILOGRAM, 1, 1, -2, 0, 0, 0, 0);
    //JOULE("joule", KILOGRAM, METER, SECOND, -2, 2, 0, 0),
    //WATT("watt", KILOGRAM, METER, SECOND, -3, 2, 0, 0);
    private String name;
    private Unit baseUnit;
    private int[] exponents;
    private boolean isMain;
    private Unit(String name, Unit baseUnit) {
        this.name = name;
        this.isMain = baseUnit == null ? true : false;
        this.exponents = new int[7];
    }
    private Unit(String name, Unit baseUnit, int massExp, int lengthExp, int timeExp, int currentExp, int temperatureExp, int amountExp, int luminousExp) {
        this(name, baseUnit);
        this.exponents[0] = massExp;
        this.exponents[1] = lengthExp;
        this.exponents[2] = timeExp;
        this.exponents[3] = currentExp;
        this.exponents[4] = temperatureExp;
        this.exponents[5] = amountExp;
        this.exponents[6] = luminousExp;
    }



    public String getValues(){
        String s="";
        for (Unit i:Unit.values()) {
            if (this.exponents[i.ordinal()] != 0){
                if (this.exponents[i.ordinal()] != 1){
                    s+=i.toString() + " ^ " + this.exponents[i.ordinal()] + " ";
                } else {
                    s+=i.toString() + " ";
                }

            }
        }
        return s;
    }

    public String getName() {
        return name;
    }
    public Unit getBaseUnit() {
        return baseUnit;
    }
    public int[] getExponents() {
        return exponents;
    }
    public double convertTo(double value, Unit otherUnit) {
        if (this == otherUnit) {
            return value;
        }
        if (this.baseUnit != otherUnit.baseUnit) {
            throw new IllegalArgumentException("Incompatible units");
        }
        double factor = 1;
        for (int i = 0; i < exponents.length; i++) {
            factor *= Math.pow(otherUnit.exponents[i] * 1.0 / exponents[i], exponents[i]);
        }
        return value * factor;
    }
}
