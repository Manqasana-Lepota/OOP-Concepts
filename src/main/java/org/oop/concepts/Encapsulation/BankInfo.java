package org.oop.concepts.Encapsulation;

public class BankInfo {
    /*
    declaring instance variable
    accName, accNo, accType,balance
     */
    private String accName;
    private String accNo;
    private String accType;
    private double balance;

    /*
    getter and setter methods for
    accName,accNo,accType and balance
     */

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
