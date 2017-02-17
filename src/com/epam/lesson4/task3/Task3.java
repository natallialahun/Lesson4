package com.epam.lesson4.task3;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Task3 {

    public static void main(String[] arg){
        Group group = new Group();
        group.add(new Student(1, "Ivan", "Ivanov", 3,4,5,2));
        group.add(new Student(2, "Petr", "Petrov", 2,4,5,5,1));
        group.add(new Student(3, "Sidor", "Sidorov",5,5,5,5,5));
        group.add(new Student(4, "Ivan1", "Ivanov1",5,5,5,5,5));
        group.add(new Student(4, "Petr1", "Petrov1", 4,5,5,5,5));

        System.out.println("Avegare mark of group = " +group.getAverageMark());

        for (Student student: group) {
            System.out.printf("%s %s: average mark = %.2f\n",student.getFirstName(), student.getLastName(), student.getAverageMark());
        }

        System.out.println("The number of excellent pupil = "+ group.getNumberOfExcellentPupil());
        System.out.println("The number of losers = "+ group.getNumberOfLosers());

    }
}
