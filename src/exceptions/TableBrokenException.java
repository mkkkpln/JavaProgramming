package exceptions;

public class TableBrokenException extends RuntimeException {
    public TableBrokenException(String message) {
        super(message);
    }
}