/**
 * Class used to generate Empty Tree Exception
 */
public class EmptyTreeException extends RuntimeException {

    /**
     * Creates an Empty Tree Exception with no message
     */
    public EmptyTreeException() {
        this(null);
    }

    /**
     * Creates an Empty Tree Exception with a message
     * @param message The message of type String
     */
    public EmptyTreeException(String message) {
        super(message);
    }
}
