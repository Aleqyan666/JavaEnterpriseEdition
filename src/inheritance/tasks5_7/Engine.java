package inheritance.tasks5_7;

public class Engine {
    public double litersPer100Mile;
    public String engineType;
    public boolean isElectric;

    public Engine(double litersPer100Mile, String engineType, boolean isElectric) {
        this.litersPer100Mile = litersPer100Mile;
        this.engineType = engineType;
        this.isElectric = isElectric;
    }

    public double getLitersPer100Mile() {
        return litersPer100Mile;
    }

    public void setLitersPer100Mile(double litersPer100Mile) {
        this.litersPer100Mile = litersPer100Mile;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
