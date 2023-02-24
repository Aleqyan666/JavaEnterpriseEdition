package inheritance;

public class SubClass extends SuperClass{
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
}
