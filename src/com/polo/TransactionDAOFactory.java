package com.polo;

class TransactionDAOFactory {

    private static TransactionDAO tdao;

    private TransactionDAOFactory(){}

    public static TransactionDAO getTransactionDao(){
        if(tdao==null)
            tdao = new TransactionDAOImpl();
        return tdao;
    }
}
