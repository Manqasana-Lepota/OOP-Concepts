package org.oop.concepts.Encapsulation;

public class BankApplicationTest {
    public static void main(String[] args) {
        //Creating the object of class bankInfo
        BankInfo bi = new BankInfo();

        //setting the objects
        bi.setAccName("Ms M Lepota");
        bi.setAccNo("1233456789");
        bi.setAccType("Savings");
        bi.setBalance(5500.00);

        //Displaying account information
        System.out.println("Displaying the account Information below:");
        System.out.println("The account holder: " + bi.getAccName());
        System.out.println("Account No : " + bi.getAccNo());
        System.out.println("Account Type : " + bi.getAccType());
        System.out.println("Balance Amount : " + bi.getBalance());
    }
}
