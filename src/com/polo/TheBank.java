package com.polo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

interface TheBank {

    void deposit(int amount);

    void transfer(int amount);

    void withdraw(int amount);
}

class StandardAccount implements TheBank {
    @Override
    public void deposit(int amount) {

//        String sql = "insert into transaction (transaction_id, userId, amount, transactionLabel, receiver_id) values (?,?,?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setInt(1, transaction.getTransaction_id());
//        preparedStatement.setInt(2, transaction.getUserId());
//        preparedStatement.setDouble(3, transaction.getAmount());
//        preparedStatement.setString(4, transaction.getTransactionLabel());
//        preparedStatement.setInt(5, transaction.getReceiver_id());
//        int count = preparedStatement.executeUpdate();
//        if(count > 0)
//            System.out.println("Transaction saved");
//        else
//            System.out.println("Oops! something went wrong");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount: " + amount);
    }

    @Override
    public void transfer(int amount) {
        System.out.println("deposit amount: " + amount);
    }
}

class SavingAccount implements TheBank {

    @Override
    public void deposit(int amount) {
        System.out.println("deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount: " + amount);
    }

    @Override
    public void transfer(int amount) {
        System.out.println("deposit amount: " + amount);
    }
}

class LoanAccount implements TheBank {
    @Override
    public void deposit(int amount) {
        System.out.println("deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount: " + amount);
    }

    @Override
    public void transfer(int amount) {
        System.out.println("deposit amount: " + amount);
    }
}

class Factory {
    public static TheBank getAccount(AccountType id) {
        switch (id) {
            case SAVING_ACCOUNT:
                return new SavingAccount();
            case STANDARD_ACCOUNT:
                return new StandardAccount();
            case LOAN_ACCOUNT:
                return new LoanAccount();
            default:
                return null;
        }
    }
}

enum AccountType {
    SAVING_ACCOUNT,
    STANDARD_ACCOUNT,
    LOAN_ACCOUNT
}

//public class Demo8 {
//    public static void main(String[] args) {
////        SavingAccount account = new SavingAccount();
////        StandardAccount account1 = new StandardAccount();
//        TheBank account = Factory.getAccount(AccountType.SAVING_ACCOUNT);
//        account.deposit(1000);
//        account.withdraw(500);
//    }
//}
