# Banking Service

This is a simple banking service implemented in Java, fulfilling the requirements of the Technical Test 1 provided by Skypay.

##  Features

- Deposit money into an account
- Withdraw money from an account with **insufficient balance handling**
- Print the bank statement in reverse chronological order
- Handle invalid amounts
- Use of exceptions for invalid operations
- Unit tests for main functionalities

##  Structure du projet

banking-service
├── src
│ ├── main/java/ma/skypay/banking
│ │ ├── service
│ │ │ ├── AccountService.java
│ │ │ └── Account.java
│ │ ├── model
│ │ │ └── Transaction.java
│ │ └── exception
│ │ ├── InvalidAmountException.java
│ │ └── InsufficientBalanceException.java
│ └── test/java/ma/skypay/banking/service
│ └── AccountTest.java
└── pom.xml

##  How to run
1. Clone the repository:
```bash
git clone https://github.com/AyoubeJarhni1/test-banking-service.git
2. Navigate into the project folder:
cd banking-service
3. run Main.java directly from your IDE.
4. run the tests 
mvn test

