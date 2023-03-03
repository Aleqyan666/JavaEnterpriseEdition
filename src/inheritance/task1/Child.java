package inheritance.task1;

import inheritance.task1.Parent;

public class Child extends Parent {


    @Override
    public void showMessage() {
        System.out.println("Hello Child Class");
    }
    public void show(){
        showMessage();
        super.showMessage();
    }

    
}
