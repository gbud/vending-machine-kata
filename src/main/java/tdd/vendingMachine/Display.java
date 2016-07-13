package tdd.vendingMachine;

public class Display {
    public static final String EMPTY_SHELVE_MSG = "EMPTY";

    private String message;

    public void display(String message) {
        this.message = message;
    };

    public String getMessage() {
        return message;
    }
}
