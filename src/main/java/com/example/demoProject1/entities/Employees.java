package com.example.demoProject1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EmploeesInfo")
public class Employees {

    //We are storing following employees information.

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int empId;
    private String empName;
    private String empEmail;
    private String empAddress;


}
