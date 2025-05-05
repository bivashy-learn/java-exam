package kz.enu.javaee.exam.doctorrepo.controller;

import kz.enu.javaee.exam.doctorrepo.entity.Doctor;

import java.math.BigDecimal;

public class DoctorModel {

    private String firstName;
    private String lastName;
    private String position;
    private BigDecimal salary;
    private int experienceMonth
            ;

    public DoctorModel() {
    }

    public DoctorModel(String firstName, String lastName, String position, BigDecimal salary, int experienceMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.experienceMonth = experienceMonth;
    }

    public Doctor asDoctor() {
        return new Doctor(firstName, lastName, position, salary, experienceMonth);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public int getExperienceMonth() {
        return experienceMonth;
    }

}
