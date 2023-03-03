package abstract_Interface.task2;

import abstract_Interface.task2.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("The circle is drawn");
    }

    @Override
    public void erase() {
        System.out.println("The circle is erased");
    }
}
