package abstract_Interface;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("The circle is drawn");
    }

    @Override
    public void erase() {
        System.out.println("The circle is erased");
    }
}
