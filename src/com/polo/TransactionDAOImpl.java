package com.polo;

import java.sql.*;
import java.util.List;

//import static java.time.LocalTime.now;

class TransactionDAOImpl implements TransactionDAO {

    private static Statement statement = null;
    Connection connection = null;

    public TransactionDAOImpl()  {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addTransaction(Transaction transaction) throws SQLException {
        String sql = "insert into transaction (transaction_id, userId, amount, transactionLabel, receiver_id) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, transaction.getTransaction_id());
        preparedStatement.setInt(2, transaction.getUserId());
        preparedStatement.setDouble(3, transaction.getAmount());
        preparedStatement.setString(4, transaction.getTransactionLabel());
        preparedStatement.setInt(5, transaction.getReceiver_id());

        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Transaction saved");
        else
            System.out.println("Oops! something went wrong");
    }
// ********************************************getting users transactions
    public void getUserTransactions (int id) throws SQLException {
        int count = 0;
        String sql = "SELECT * FROM Transaction where userId =" + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet result = preparedStatement.executeQuery(sql);

        while (result.next()){
            double amount = result.getDouble(3);
            String transactionLabel = result.getString(4);
            String date = result.getString(6);

            String output = "User #%d: %s - %s - %s";
            System.out.println("Transaction:  $" + amount + "      "+ transactionLabel + "      " + date + "." );
        }

    }

    // ************************************************** deposit total
    public void getUserDepTotal (int id) throws SQLException {

        String sql = "select userId, SUM(amount) as 'Deposits' from transaction where transactionLabel =  'deposit'  AND userId = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet dep = preparedStatement.executeQuery(sql);

        while (dep.next()){
            System.out.println("Deposits Total:  $" + dep.getDouble(2));
        }
    }

    // ************************************************** received transfers total
        public void getUserTransRecTotal (int id) throws SQLException {

        String sql = "select userId, SUM(amount) as 'Transfers' from transaction where transactionLabel =  'transfer'  AND receiver_id = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet tranRec = preparedStatement.executeQuery(sql);

            while (tranRec.next()){
                System.out.println("Transfers Received Total:  $" + tranRec.getDouble(2));
            }
    }

    // ************************************************** withdraw total
    public void getUserWithTotal (int id) throws SQLException {

        String sql = "select amount, SUM(amount) as 'Withdraws' from transaction where transactionLabel =  'withdraw'  AND userId = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet with = preparedStatement.executeQuery(sql);

        while (with.next()){
            System.out.println("Withdraw Total:  $" + with.getDouble(2));
        }
    }

    // ************************************************** transfer Out totals
    public void getUserTransOutTotal (int id) throws SQLException {

        String sql = "select amount, SUM(amount) as 'Transfers' from transaction where transactionLabel =  'transfer'  AND userId = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet tranOut = preparedStatement.executeQuery(sql);

        while (tranOut.next()) {
            System.out.println("Transfers 0ut:  $" + tranOut.getDouble(2));
        }
    }


    @Override
    public List<Transaction> getTransaction() {
        return null;
    }

    @Override
    public Transaction transactionById(int transaction_id) {
        return null;
    }


}
