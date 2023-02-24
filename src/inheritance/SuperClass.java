package inheritance;

public class SuperClass {
    public String message = "Hello SuperClass class";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SuperClass(String message) {
        this.message = message;
    }
}
