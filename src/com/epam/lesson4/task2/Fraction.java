package com.epam.lesson4.task2;

import java.util.Formatter;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Fraction {
    /*Определить класс «Дробь» в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей.*/
    private final int m;
    private final int n;

    Fraction(int m, int n){// а куда порерялся атрибут доступа у конструктора?
        this.m = m;
        this.n = n;
    }
// и get-методов нет
    @Override
    public String toString(){
        return String.format("%d/%d", m, n);
    }
}
