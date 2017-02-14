package com.nkats.desktop.persistence.entities;

import javax.persistence.*;

/**
 * @author Nikos Katsikogiannis
 */
@Entity
@Table(name = "director", schema = "querydsl")
@PrimaryKeyJoinColumn(name = "director_id", referencedColumnName = "id")
@DiscriminatorValue("3")
public class Director extends Person {
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
