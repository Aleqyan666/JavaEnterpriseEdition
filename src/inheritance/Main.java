package inheritance;

public class Main {

    public static void main(String[] args) {
      Child child = new Child();
      child.show();


        SubClass subClass = new SubClass("Hello Parent Class");
        subClass.showMessages();
    }
}
