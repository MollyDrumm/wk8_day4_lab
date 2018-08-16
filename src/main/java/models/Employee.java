package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance( strategy = InheritanceType.JOINED)
public class Employee {

    private int id;
    private String name;
    private int niNumber;
    private int salary;

    public Employee(){
    }

    public Employee(String name, int niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "ni_number")
    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
