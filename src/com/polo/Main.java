package com.polo;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    
    //A lot of this commented out.... main still in bad shape... ************************************************************** Immediate upload aftewr presentations.

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int currentUser = 6;
        UserDAO dao = UserDAOFactory.getUserDao();
        TransactionDAO tdao = TransactionDAOFactory.getTransactionDao();
        String Admin_Entrance = "IHaveSupervisoryPermission";
        int adminInput;
        int userInput;

        LinkedList<String> logins = new LinkedList<String>();
        logins.clear();

        Scanner scanner = new Scanner(System.in);
        ScreenView sv = new ScreenView();
        boolean flag = true;

//        sv.printInitScreen();
//        userInput = scanner.nextInt();

                // rebuild login logic.  *****************************************************
                System.out.println("BANKIT");
                System.out.println("****************> Logging In");
                System.out.println("Please enter an email address.");
                String email = scanner.next();
                System.out.println("Please enter your password.");
                String password = scanner.next();
                logins.add(email);
                logins.add(password);
////        while (flag) {
//                if (password.equals(Admin_Entrance)) {
//                    System.out.println("Your logged in Boss!");
//                    sv.printSupervisorScreen();
//
//                        adminInput = scanner.nextInt();
//                        System.out.println("Your logged in Boss!");
//                        sv.printSupervisorScreen();
//                        switch(adminInput) {
//                            case 1:
//                                System.out.println("all transactions here...");
//                                break;
//                            case 2:
//                                System.out.println("repairs");
//                                break;
//                            case 3:
//                                tdao.getUserTransactions(currentUser);
//                                tdao.getUserDepTotal(currentUser);
//                                tdao.getUserTransRecTotal(currentUser);
//                                tdao.getUserWithTotal(currentUser);
//                                tdao.getUserTransOutTotal(currentUser);
//                                break;
//                        }
//
////                            flag = false;
//                   }
//
//         else{
//
////            while (flag) {
                sv.userOptions();
                userInput = scanner.nextInt();

                switch (userInput) {

                    case 1:
                        System.out.println("What amount are you depositing?");
                        double amount = scanner.nextDouble();
                        String transactionLabel = "deposit";

                        Transaction transaction = new Transaction();
                        transaction.setTransaction_id();
                        transaction.setUserId(currentUser);
                        transaction.setAmount(amount);
                        transaction.setTransactionLabel(transactionLabel);
                        transaction.setReceiver_id(0);

                        // adding/ creating new transaction
                        tdao.addTransaction(transaction);
                        System.out.println("Your deposit of " + amount + " was successful.");
                        break;
                    case 2:

                        System.out.println("What amount are you withdrawing?");
                        amount = scanner.nextDouble();
                        transactionLabel = "withdraw";

                        transaction = new Transaction();
                        transaction.setTransaction_id();
                        transaction.setUserId(currentUser);
                        transaction.setAmount(amount);
                        transaction.setTransactionLabel(transactionLabel);
                        transaction.setReceiver_id(0);

                        // adding/ creating new transaction
                        tdao.addTransaction(transaction);
                        System.out.println("Your withdraw of " + amount + " was successful.");
                        break;
                    case 3:
                        System.out.println("What amount are you Transferring?");
                        amount = scanner.nextDouble();
                        System.out.println("Please enter the recipient's account number.");
                        int receiver_id = scanner.nextInt();
                        transactionLabel = "transfer";

                        transaction = new Transaction();
                        transaction.setTransaction_id();
                        transaction.setUserId(currentUser);
                        transaction.setAmount(amount);
                        transaction.setTransactionLabel(transactionLabel);
                        transaction.setReceiver_id(receiver_id);

                        // adding/ creating new transaction
                        tdao.addTransaction(transaction);
                        System.out.println("Your transfer of $" + amount + " was successful.");
                        break;
                    case 4:
                        tdao.getUserTransactions(currentUser);
                        tdao.getUserDepTotal(currentUser);
                        tdao.getUserTransRecTotal(currentUser);
                        tdao.getUserWithTotal(currentUser);
                        tdao.getUserTransOutTotal(currentUser);
                        break;
                }

//                flag = false;
            }


//                break;
//            case 1:
//                System.out.println("Please enter your first name.");
//                String firstName = scanner.next();
//                System.out.println("Please enter your last name.");
//                String lastName = scanner.next();
//                System.out.println("Please enter an email address.");
//                String name = firstName + " " + lastName;
//                String email = scanner.next();
//                System.out.println("Please enter your age.");
//                int age = scanner.nextInt();
//                if (age < 18) {
//                    System.out.println("Sorry, you are not eligible for an account at this time");
//                }
//                System.out.println("Please create a Password");
//                String password = scanner.next();
//                Boolean loggedIn = true;
//                System.out.println("You've logged in!");
//
//                //defining new user
//                User user = new User();
//                user.setId();
//                user.setName(name);
//                user.setEmail(email);
//                user.setAge(age);
//                user.setRole("user");
//                user.setAccountBalance(0);
//                user.setLoggedIn(true);
//
//
//                // adding/ creating new user
//                dao.addUser(user);
//                break;
//
////            Transaction transaction = new Transaction();
//            transaction.setTransaction_id();
//            transaction.setUserId(currentUser);
//            transaction.setAmount(amount);
////            transaction.setTransactionLabel(transactionLabel);
//            transaction.setReceiver_id(0);
//
//            // adding/ creating new transaction
//            tdao.addTransaction(transaction);
//            System.out.println("Your deposit of " + amount + " was successful.");
//            sv.userOptions();
//            userInputC2 = scanner.nextInt();
//
//            switch (userInputC2) {
//                case 1:
//
//                    System.out.println("What amount are you depositing?");
//                    amount = scanner.nextDouble();
//                    String transactionLabel = "deposit";
//
//                    transaction = new Transaction();
//                    transaction.setTransaction_id();
//                    transaction.setUserId(currentUser);
//                    transaction.setAmount(amount);
//                    transaction.setTransactionLabel(transactionLabel);
//                    transaction.setReceiver_id(0);
//
//                    // adding/ creating new transaction
//                    tdao.addTransaction(transaction);
//                    System.out.println("Your deposit of " + amount + " was successful.");
//
//                    break;
//                case 2:
//
//                    System.out.println("What amount are you withdrawing?");
//                    amount = scanner.nextDouble();
//                    transactionLabel = "withdraw";
//
//                    transaction = new Transaction();
//                    transaction.setTransaction_id();
//                    transaction.setUserId(currentUser);
//                    transaction.setAmount(amount);
//                    transaction.setTransactionLabel(transactionLabel);
//                    transaction.setReceiver_id(0);
//
//                    // adding/ creating new transaction
//                    tdao.addTransaction(transaction);
//                    System.out.println("Your withdraw of " + amount + " was successful.");
//
//                    break;
//                case 3:
//
//                    System.out.println("What amount are you Transferring?");
//                    amount = scanner.nextDouble();
//                    System.out.println("Please enter the recipient's account number.");
//                    int receiver_id = scanner.nextInt();
//                    transactionLabel = "transfer";
//
//                    transaction = new Transaction();
//                    transaction.setTransaction_id();
//                    transaction.setUserId(currentUser);
//                    transaction.setAmount(amount);
//                    transaction.setTransactionLabel(transactionLabel);
//                    transaction.setReceiver_id(receiver_id);
//
//                    // adding/ creating new transaction
//                    tdao.addTransaction(transaction);
//                    System.out.println("Your transfer of $" + amount + " was successful.");
//                    break;
//                case 4:
//
//                    tdao.getUserTransactions(currentUser);
//                    tdao.getUserDepTotal(currentUser);
//                    tdao.getUserTransRecTotal(currentUser);
//                    tdao.getUserWithTotal(currentUser);
//                    tdao.getUserTransOutTotal(currentUser);
//                    break;


        }
