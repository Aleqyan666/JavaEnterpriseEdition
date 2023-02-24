package inheritance;

public class Job {
    private String position;
    private int id;
    private double salary;

    public Job(String position, int id, double salary) {
        this.position = position;
        this.id = id;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
