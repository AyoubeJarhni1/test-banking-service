package ma.skypay.banking.service;

import ma.skypay.banking.exception.InsufficientBalanceException;
import ma.skypay.banking.exception.InvalidAmountException;
import ma.skypay.banking.model.Transaction;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


/**
 * Account class represents a bank account that allows deposits, withdrawals, and printing of account statements.
 * It maintains a list of transactions and the current balance.
 */
public class Account implements  AccountService{

    private  final  List<Transaction> transactions;
    private int balance= 0 ;
    private LocalDate dateTransaction= LocalDate.now();
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Account() {
        this.transactions = new java.util.ArrayList<>();
    }

    public void setDateTransaction(LocalDate dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    @Override
    public void deposit(int amount) {
           verifyAmount(amount);
            balance += amount;
            Transaction transaction = new Transaction(amount, dateTransaction, balance);
            transactions.add(transaction);
    }

    @Override
    public void withdraw(int amount) {
            verifyAmount(amount);
             if (amount> balance){
               throw new InsufficientBalanceException("Insufficient balance");
              }
            balance -= amount;
            Transaction transaction = new Transaction(-amount, dateTransaction, balance);
            transactions.add(transaction);
    }

    @Override
    public void printStatement() {
        System.out.println("DATE        ||     AMOUNT ||     BALANCE");
        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction transaction = transactions.get(i);
            System.out.printf(
                    "%s  ||  %7d   ||  %7d%n",
                    transaction.getDateTransaction().format(DATE_FORMAT),
                    transaction.getAmount(),
                    transaction.getBalance());
        }
    }

    private void  verifyAmount(int amount){
             if (amount <=0){
                 throw new InvalidAmountException("Amount must be positive");
             }
    }



}
