package com.RestApiTest.RestApiTest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
