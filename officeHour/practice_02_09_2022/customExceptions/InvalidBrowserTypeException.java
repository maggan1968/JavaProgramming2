package practice_02_09_2022.customExceptions;

public class InvalidBrowserTypeException extends RuntimeException {


    public InvalidBrowserTypeException(String message) {
        super(message);
    }
}
