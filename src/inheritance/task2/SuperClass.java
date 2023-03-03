package inheritance.task2;

public class SuperClass {
    public String messages = "Hello SuperClass class";

    public String getMessage() {
        return messages;
    }

    public void setMessage(String message) {
        this.messages = message;
    }

    public SuperClass(String message) {
        this.messages = message;
    }
}
