package ma.skypay.banking.exception;

/**
 * Exception thrown when an account has insufficient balance for a withdrawal.
 */
public class InsufficientBalanceException  extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
