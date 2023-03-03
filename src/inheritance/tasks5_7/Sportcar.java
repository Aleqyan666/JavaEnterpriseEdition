package inheritance.tasks5_7;

public class Sportcar {
    public String model;
    public int yearPublished;
    public double price;
    public Engine engine;

    public Sportcar(String model, int yearPublished, double price, Engine engine) {
        this.model = model;
        this.yearPublished = yearPublished;
        this.price = price;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Sportcar sportcar = new Sportcar("BMW",2005, 25000.05,
                new Engine(2.5,"hybrid",false));
        System.out.println("Model : " + sportcar.getModel());
        System.out.println("Price : " + sportcar.getPrice());
    }
}
