package com.epam.lesson4.task1;

import java.util.Date;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Task1 {

    public static void main(String[] args){
        Student student = new Student(1, "Ivanov", "Ivan", new Date(1980,1,0));
        student.setPhoneNumber("+2348623987");
        student.show();

        Customer customer = new Customer(1, "Petrov", "Petr", "Petrovich", "Kuprevicha 1/1", 1273824238, 234947589);
        customer.show();
        System.out.println(customer.getReverseFirstName());


    }
}
