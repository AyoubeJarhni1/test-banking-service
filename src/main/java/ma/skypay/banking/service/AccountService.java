package ma.skypay.banking.service;

/**
 * Service interface for account operations.
 */

public interface AccountService {
          void deposit(int amount);
            void withdraw(int amount);
            void printStatement();

}
