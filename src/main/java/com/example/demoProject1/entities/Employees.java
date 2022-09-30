package com.example.demoProject1.entities;

import javax.persistence.*;

@Entity
@Table(name="EmploeesInfo")
public class Employees {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int empId;
    private String empName;
    private String empEmail;
    private String empAddress;


    public Employees() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public String getEmpAddress() {
        return empAddress;
    }



    public Employees(String empId, String empName, String empEmail, String empAddress) {
        this.empId = Integer.parseInt(empId);
        this.empName = empName;
        this.empEmail = empEmail;
        this.empAddress = empAddress;
    }

    public void setEmpId(String empId) {
        this.empId = Integer.parseInt(empId);
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }



    @Override
    public String toString() {
        return "Employees{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
