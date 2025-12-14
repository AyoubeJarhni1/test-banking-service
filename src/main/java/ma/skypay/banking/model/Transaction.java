package ma.skypay.banking.model;

import java.time.LocalDate;

/**
 * Represents a banking transaction.
 */

public class Transaction {

           private final int amount;
           private final LocalDate dateTransaction;
           private final int balance;

              public Transaction(int amount, LocalDate dateTransaction, int balance) {
                          this.amount = amount;
                          this.dateTransaction = dateTransaction;
                          this.balance = balance;
              }
              public LocalDate getDateTransaction() {
                    return dateTransaction;
               }

           public int getBalance() {
           return balance;
            }

    public int getAmount() {
        return amount;
    }


}
