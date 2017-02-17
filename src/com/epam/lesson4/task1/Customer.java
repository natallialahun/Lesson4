package com.epam.lesson4.task1;


/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Customer {

    private final int id;
    private final String lastName;
    private final String firstName;
    private String middleName;
    private String address;
    private int creditNumber;
    private int accountNumber;

    Customer(int id, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    Customer(int id, String lastName, String firstName, String middleName, String address, int creditNumber, int accountNumber){
        this(id, lastName, firstName);
        this.middleName = middleName;
        this.address = address;
        this.creditNumber = creditNumber;
        this.accountNumber = accountNumber;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public void show(){

        System.out.println("Id = " + id);
        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Middle Name = "+ middleName);
        System.out.println("Address = " + address);
        System.out.println("Credit Card Number = " + creditNumber);
        System.out.println("Account Number = "+ accountNumber);
    }

    public String getReverseFirstName()
    {
        return new StringBuilder(firstName).reverse().toString();
    }
}
