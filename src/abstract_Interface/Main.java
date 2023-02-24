package abstract_Interface;

public class Main {

    public static void main(String[] args) {
        A_Student a = new A_Student(46.2,60,75);
        a.getPercentage();
        B_Student b = new B_Student(100,99,22,96);
        b.getPercentage();

        Child1 child1 = new Child1();
        child1.message();
        Child2 child2 = new Child2();
        child2.message();

        SubSubClass ss = new SubSubClass();
        ss.a_method();
        ss.nonAbstract_method();

        Dogs jack = new Dogs();
        jack.dogs();
        Cats gina = new Cats();
        gina.cats();
    }
}
