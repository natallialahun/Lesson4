package com.epam.lesson4.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Student {
    private final int id;
    private final String firstName;
    private final String lastName;
    private List<Integer> marks = new ArrayList<Integer>();

    Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(int id, String firstName, String lastName, Integer... marks){
        this(id, firstName, lastName);
        this.setMarks(marks);
    }

    public void setMarks(Integer...  marks){
        for (int mark: marks) {
            this.marks.add(mark);
        }
    }

    public List<Integer> getMarks(){
        return marks;
    }

    public double getSumMark()
    {
        double sum = 0;
        for (int mark: marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMarkCount()
    {
        return marks.size();
    }

    public double getAverageMark(){
        return getSumMark()/getMarkCount();
    }

    public boolean isExcellentPupil()
    {
        for (Integer mark: marks) {
            if(mark < 5){
                return false;
            }
        }
        return true;
    }

    public boolean isLooser()
    {
        for (Integer mark: marks) {
            if(mark ==2 ){
                return true;
            }
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
