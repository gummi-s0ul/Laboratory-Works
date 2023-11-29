package LabWork19;

public class NotValidInnException extends RuntimeException {

    private final String innNum;

    public NotValidInnException(String inn) {
        super("INN " + inn + " is not valid, please try again.");
        innNum = inn;
    }
}