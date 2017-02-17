package com.epam.lesson4.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natallia_Lahun on 02/17/2017.
 */
public class Abiturient {
    private final String firstName;
    private final String lastName;
    private Integer[] marks = new Integer[4];

    public Abiturient(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Abiturient(String firstName, String lastName, Integer[] marks){
        this(firstName, lastName);
        this.marks = marks;
    }

    public double getAverageMark(){
        return getSumMark()/4.0;
    }

    private int getSumMark(){
        int sum = 0;
        for (int mark:marks) {
            sum +=mark;
        }
        return sum;
    }

    public void show(){
        System.out.printf("%s %s: average mark is %.2f\n",firstName, lastName, getAverageMark());
    }

}
