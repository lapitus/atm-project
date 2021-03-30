package Exceptions;

public class BadPinException extends Exception {
    private int pin;

    public BadPinException(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return ("Bad pin " + pin + ". Result:" + pin % 2 );
    }
}
