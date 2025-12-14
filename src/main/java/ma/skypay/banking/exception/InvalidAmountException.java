package ma.skypay.banking.exception;

/**
 * Exception thrown when an invalid amount is provided for a transaction.
 */
public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String message) {
        super(message);
    }

}
