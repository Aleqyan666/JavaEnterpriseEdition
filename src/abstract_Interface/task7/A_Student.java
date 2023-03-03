package abstract_Interface.task7;

public class A_Student extends Marks {
    public double grade1;
    public double grade2;
    public double grade3;

    public A_Student(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    private double getGrade1() {
        return grade1;
    }

    private void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    private double getGrade2() {
        return grade2;
    }

    private void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    private double getGrade3() {
        return grade3;
    }

    private void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    @Override
    public void getPercentage() {
        System.out.println("Grade percentage of A = " + (getGrade1() + getGrade2() + getGrade3() )/3 + "%");
    }
}
