package kz.enu.javaee.exam.doctorrepo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String position;
    private BigDecimal salary;
    @Range(min = 0)
    private int experienceMonth;

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String position, BigDecimal salary, int experienceMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.experienceMonth = experienceMonth;
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

    @Range(min = 0)
    public int getExperienceMonth() {
        return experienceMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Doctor doctor))
            return false;
        return id == doctor.id && experienceMonth == doctor.experienceMonth && Objects.equals(firstName, doctor.firstName) &&
                Objects.equals(lastName, doctor.lastName) && Objects.equals(position, doctor.position) &&
                Objects.equals(salary, doctor.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, position, salary, experienceMonth);
    }

}
