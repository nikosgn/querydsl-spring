package com.nkats.desktop.persistence.entities;

import javax.persistence.*;

/**
 * @author Nikos
 */
@Entity
@Table(name = "employee", schema = "querydsl")
@PrimaryKeyJoinColumn(name = "employee_id", referencedColumnName = "id")
@DiscriminatorValue("2")
public class Employee extends Person {
    @Column
    private double salary;

    @Column(name = "person_type")
    private Integer personType;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getPersonType() {
        return personType;
    }

    public void setPersonType(Integer personType) {
        this.personType = personType;
    }
}
