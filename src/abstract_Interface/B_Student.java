package abstract_Interface;

public class B_Student extends Marks {
    public double grade1;
    public double grade2;
    public double grade3;
    public double grade4;

    public B_Student(double grade1, double grade2, double grade3, double grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
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

    private double getGrade4() {
        return grade4;
    }

    private void setGrade4(double grade4) {
        this.grade4 = grade4;
    }

    @Override
    public void getPercentage() {
        System.out.println("Grade percentage of B = " + (getGrade1() + getGrade2() + getGrade3() + getGrade1())/4 + "%");
    }
}
