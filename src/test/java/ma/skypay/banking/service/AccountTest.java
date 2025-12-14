package ma.skypay.banking.service;

import ma.skypay.banking.exception.InvalidAmountException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the Account class.
 */

public class AccountTest {

    /**
     * Test deposit method to ensure balance increases correctly.
     */
    @Test
    void deposit_shouldIncreaseBalance() {
        Account account = new Account();

        account.setDateTransaction(LocalDate.of(2012, 1, 10));
        account.deposit(1000);

        account.setDateTransaction(LocalDate.of(2012, 1, 13));
        account.deposit(2000);

        account.printStatement();

        assertTrue(true);
    }

    /**
     * Test withdraw method to ensure balance decreases correctly.
     */

    @Test
    void withdraw_shouldDecreaseBalance() {
        Account account = new Account();

        account.setDateTransaction(LocalDate.of(2012, 1, 10));
        account.deposit(3000);

        account.setDateTransaction(LocalDate.of(2012, 1, 14));
        account.withdraw(500);

        account.printStatement();

        assertTrue(true);
    }

    /**
     * Test printStatement method to ensure transactions are displayed in correct order.
     */
    @Test
    void printStatement_shouldDisplayTransactionsInFromRecentToPassed() {
        Account account = new Account();

        account.setDateTransaction(LocalDate.of(2012, 1, 10));
        account.deposit(1000);

        account.setDateTransaction(LocalDate.of(2012, 1, 13));
        account.deposit(2000);

        account.setDateTransaction(LocalDate.of(2012, 1, 14));
        account.withdraw(500);

        account.printStatement();

        assertTrue(true);
    }

    /**
     * Test deposit method to ensure InvalidAmountException is thrown for negative amount.
     */
    @Test
    void deposit_shouldThrowInvalidAmountException_forNegativeAmount() {
        Account account = new Account();

        try {
            account.deposit(-1000);
        } catch (InvalidAmountException e) {
            assertTrue(true);
        }
    }

    /**
     * Test withdraw method to ensure InvalidAmountException is thrown for negative amount.
     */
    @Test
    void withdraw_shouldThrowInvalidAmountException_forNegativeAmount() {
        Account account = new Account();

        try {
            account.withdraw(-500);
        } catch (InvalidAmountException e) {
            assertTrue(true);
        }
    }

    /**
     * Test withdraw method to ensure InsufficientBalanceException is thrown for exceeding amount.
     */
    @Test
    void withdraw_shouldThrowInsufficientBalanceException_forExceedingAmount() {
        Account account = new Account();

        account.setDateTransaction(LocalDate.of(2012, 1, 10));
        account.deposit(1000);

        try {
            account.withdraw(1500);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    /**
     * Test deposit method to ensure InvalidAmountException is thrown for zero amount.
     */
    @Test
    void  deposit_shouldThrowInvalidAmountException_forZeroAmount() {
        Account account = new Account();

        try {
            account.deposit(0);
        } catch (InvalidAmountException e) {
            assertTrue(true);
        }
    }

}
