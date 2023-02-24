package abstract_Interface;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("The triangle is drawn");
    }

    @Override
    public void erase() {
        System.out.println("The triangle is erased");
    }
}
