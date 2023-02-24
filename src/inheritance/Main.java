package inheritance;

public class Main {

    public static void main(String[] args) {
      Child child = new Child();
      child.showMessage();

        SuperClass superClass = new SuperClass("York");
        System.out.println(superClass.getMessage());
    }
}
