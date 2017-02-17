package com.epam.lesson4.task1;

import java.util.Date;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */

public class Student {
    /*
    * Создать описанные ниже классы. Определить конструктор и методы set(), get(), show(). Определить дополнительно какой – либо метод для каждого класса. Реализовать класс в консольном приложении. Задать критерий выбора данных и вывести эти данные на консоль.
Student : id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.*/
    private final int id;
    private final String lastName;
    private final String firstName;
    private  String middleName;
    private final Date birthDay;
    private  String address;
    private  String phoneNumber;
    private  String department;
    private  int course;

    public Student(int id, String lastName, String firstName, String middleName, Date birthDay, String address, String phoneNumber, String department, int course){
        this(id, lastName, firstName, birthDay);
        this.middleName  = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.course = course;
    }

    public Student(int id, String lastName, String firstName, Date birthDay){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse(){
        return this.course;
    }

    public void show(){
        System.out.println("Id = " + this.id);
        System.out.println("First Name = " + this.firstName);
        System.out.println("Last Name = " + this.lastName);
        System.out.println("Middle Name = "+ this.middleName);
        System.out.println("Birthday = "+ this.birthDay);
        System.out.println("Address = " + this.address);
        System.out.println("Phone number = " + this.phoneNumber);
        System.out.println("Department = "+ this.department);
        System.out.println("Course = " + this.course);

    }

    public String getReverseFirstName()
    {
        return new StringBuilder(firstName).reverse().toString();
    }

}
