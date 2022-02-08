package practice_02_02_2022.customExceptions;

public class InvalidBrowserTypeException extends RuntimeException {


    public InvalidBrowserTypeException(String message) {
        super(message);
    }
}
