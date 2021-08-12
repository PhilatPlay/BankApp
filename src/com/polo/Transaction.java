package com.polo;


public class Transaction {
    private int transaction_id;
    private int userId;
    private double amount;
    private String transactionLabel;
    private int receiver_id;


    public Transaction(int transaction_id, int userId, double amount, String transactionLabel, int receiver_id) {
        this.transaction_id = transaction_id;
        this.userId = userId;
        this.amount = amount;
        this.transactionLabel = transactionLabel;
        this.receiver_id = receiver_id;

    }

    public Transaction() {

    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id() {
        this.transaction_id = transaction_id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionLabel() {
        return transactionLabel;
    }

    public void setTransactionLabel(String transactionLabel) {
        this.transactionLabel = transactionLabel;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

}
