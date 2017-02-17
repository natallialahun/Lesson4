package com.epam.lesson4.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Group extends ArrayList<Student> {
    //private List<Student> group = new ArrayList<Student>();

  /*  public void addStudent(Student student){
        group.add(student);
    } */

    public double getAverageMark(){
        double sum = 0;
        int count = 0;
        for (Student student: this) {
            sum += student.getSumMark();
            count += student.getMarkCount();
        }

        return sum/count;
    }

    public int getNumberOfExcellentPupil()
    {
        int num =0;
        for (Student student: this) {
            if (student.isExcellentPupil()) {
                num++;
            }
        }
        return num;
    }

    public int getNumberOfLosers()
    {
        int num =0;
        for (Student student: this) {
            if (student.isLooser()) {
                num++;
            }
        }
        return num;
    }

}
