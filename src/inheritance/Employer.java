package inheritance;

public class Employer {
    private Job job;

    public Employer(Job job) {
        this.job = job;
    }
    public double getSalary(){
        return job.getSalary();
    }
}
