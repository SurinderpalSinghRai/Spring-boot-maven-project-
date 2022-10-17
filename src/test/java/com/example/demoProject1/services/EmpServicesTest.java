package com.example.demoProject1.services;

import com.example.demoProject1.entities.Employees;
import com.example.demoProject1.repository.EmployeeRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
//import org.assertj.core.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
@DataJpaTest
public class EmpServicesTest {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Test
    void saveEmployeeTest(){
        Employees employee = new Employees("101" , "Surinder" , "surinder@gmail.com" , "Punjab");


        assertNotNull(employee);
    }


    @Test
    public void getEmployee(){
        Employees employee = employeeRepo.findById(3).get();

        Assertions.assertThat(employee.getEmpId()).isEqualTo(3);

    }

    @Test
    public void getListOfEmployeeTest(){
        List<Employees> employees = employeeRepo.findAll();
        Assertions.assertThat(employees.size()).isGreaterThan(0);
    }

    @Test
    public void updateEmployeeTest(){
        Employees employee = employeeRepo.findById(3).get();

        employee.setEmpEmail("abc@gmail.com");

        Employees updatedEmployee =  employeeRepo.save(employee);

        Assertions.assertThat(updatedEmployee.getEmpEmail()).isEqualTo("abc@gmail.com");

    }

    @Test
    public void deleteEmployeeTest(){
        Employees employee = employeeRepo.findById(9).get();

        employeeRepo.delete(employee);
    }


}