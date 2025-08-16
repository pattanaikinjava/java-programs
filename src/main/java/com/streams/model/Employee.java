package com.streams.model;

import java.util.Objects;

public class Employee {

    private Integer empId;
    private String empName;
    private Double empSalary;
    private String empDesignation;

    /* toString */
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }

    /* equals */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(empSalary, employee.empSalary) && Objects.equals(empDesignation, employee.empDesignation);
    }

    /* hashCode */
    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empSalary, empDesignation);
    }

    /* Constructors */
    public Employee(){
       // this(empId,empName,empSalary,empDesignation);
    }
    public Employee(Integer empId, String empName, Double empSalary, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
    }
    /* Getters and Setters */
    //Employee Id
    public void setEmpId(int employeeId) {
        this.empId = employeeId;
    }
    public Integer getEmpId() {
        return this.empId;
    }

    //Employee Name
    public void setEmpName(String employeeName) {
        this.empName = employeeName;
    }
    public String getEmpName() {
        return this.empName;
    }

    //Employee Salary
    public void setEmpSalary(Double employeeSalary) {
        this.empSalary = employeeSalary;
    }
    public Double getEmpSalary() {
        return this.empSalary;
    }

    //Employee Designation
    public void setEmpDesignation(String employeeDesignation) {
        this.empDesignation = employeeDesignation;
    }
    public String getEmpDesignation() {
      return this.empDesignation;
    }
}
