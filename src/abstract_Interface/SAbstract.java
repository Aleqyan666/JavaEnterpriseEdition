package abstract_Interface;

public abstract class SAbstract {
    public SAbstract() {
        System.out.println("This is a constructor of abstract class");
    }

    public abstract void a_method();

    public  void nonAbstract_method(){
        System.out.println("This is a normal method of abstract class");
    }

}
