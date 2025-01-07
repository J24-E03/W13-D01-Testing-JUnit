package com.dci.assertions;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private int salary;
    private String[] departments;

    public Employee(int empId, String firstName, String lastName, int salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(int empId, String firstName, String lastName, String[] departments) {

        this.empId = empId;
        this.firstName = firstName;
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
        this.departments = departments;
    }

    public String[] getDepartments() {
        return departments;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }


}
