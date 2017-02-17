package com.epam.lesson4.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Natallia_Lahun on 02/17/2017.
 */
public class Task4 {
    /*Имеется список абитуриентов (класс Abiturient) и список оценок,
     полученных ими на вступительных экзаменах.
      Напечатать список поступивших, если число мест меньше числа абитуриентов.*/

    private static final int numberOfStudent = 3;

    public static void main(String[] args){
        List<Abiturient> abiturients = new ArrayList<Abiturient>();
        abiturients.add(new Abiturient("Ivan", "Ivanov", new Integer[]{1,2,3,4}));
        abiturients.add(new Abiturient("Petr", "Petrov", new Integer[]{2,3,4,2}));
        abiturients.add(new Abiturient("Abiturient", "Abiturient", new Integer[]{4,4,4,5}));
        abiturients.add(new Abiturient("Abiturient1", "Abiturient1", new Integer[]{5,4,4,4}));
        abiturients.add(new Abiturient("Abiturient2", "Abiturient2", new Integer[]{5,3,4,4}));
        abiturients.add(new Abiturient("Abiturient3", "Abiturient3", new Integer[]{5,4,5,4}));

        abiturients.sort(Comparator.comparing(Abiturient::getAverageMark));
        for (int i = 0; i< numberOfStudent; i++){
            abiturients.get(abiturients.size()-i-1).show();
        }

    }
}
