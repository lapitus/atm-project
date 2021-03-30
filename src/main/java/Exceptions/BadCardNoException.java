package Exceptions;

public class BadCardNoException extends Exception {
    private String cardNo;

    public BadCardNoException(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return ("This card number " + cardNo + " not matching with template ^[0-9]{16}$");
    }
}
