package inheritance.task2;

public class SubClass extends SuperClass {
    public String message = "Hello Sub Class";
    public SubClass(String message) {
        super(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void showMessages(){
        System.out.println(message);
        System.out.println(super.getMessage());
    }
}
