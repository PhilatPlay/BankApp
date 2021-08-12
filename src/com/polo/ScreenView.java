package com.polo;

import java.util.ArrayList;
import java.util.Scanner;

public class ScreenView extends Object {
    Scanner scanner = new Scanner(System.in);

//    public void printInitScreen() {
//        String initScreen = "1. Enroll ---------> 2. Login --------> 3. Admin";
//        System.out.println(initScreen);
//    }

    public void printSupervisorScreen() {
        System.out.println("---------->");
        System.out.println("Select from the options below.");
        System.out.println("1. View User Accounts ---> 2. Cancel Account ---> 3. View Transactions --> 4. Exit");
    }

    public void userOptions() {
        System.out.println("---------->");
        System.out.println("Hello, Select from the options below.");
        System.out.println("---------->");
        System.out.println("1. Make a Deposit ---> 2. Make a Make a Withdraw ---> 3. Transfer funds ---> 4. View recent Transactions ---> 5. Exit");
    }
}




