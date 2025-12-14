package ma.skypay.banking;

import ma.skypay.banking.service.Account;
import java.time.LocalDate;

/**
 * Main class to demonstrate banking operations.
 */

public class Main {

    public static void main(String[] args) {

         Account account = new Account();
         account.setDateTransaction(LocalDate.of(2012, 1, 10));
        account.deposit(1000);

        account.setDateTransaction(LocalDate.of(2012, 1, 13));
        account.deposit(2000);

        account.setDateTransaction(LocalDate.of(2012, 1, 14));
        account.withdraw(500);

        account.printStatement();
    }
}