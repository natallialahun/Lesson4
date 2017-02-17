package com.epam.lesson4.task2;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Task2 {

    public static void main(String[] arg){
        int n = 5;
        Fraction[] fractions  = new Fraction[n];
        for (int i = 0; i < n ; i++) {
            fractions[i] = new Fraction(i+1,i+2);
        }

        printFractionArray(fractions);
    }

    public static void printFractionArray(Fraction[] fractions){
        for (Fraction f: fractions) {
            System.out.printf("%s ", f.toString());
        }
    }
}
