package com.example.demoProject1.services;

import com.example.demoProject1.entities.Employees;
import com.example.demoProject1.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServices {

    public EmpServices(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    //@Autowired
    private EmployeeRepo employeeRepo;

    public Employees saveEmployee(Employees employee) {
       return employeeRepo.save(employee);

    }
    public List<Employees> saveAllEmp(List<Employees> employees) {
        return employeeRepo.saveAll(employees);

    }
    public List<Employees> getAllEmp(){
        return employeeRepo.findAll();
    }
    public Optional<Employees> getEmpById(int id){
        return employeeRepo.findById(id);
    }

    public void deleteEmp(int id){
        employeeRepo.deleteById(id);
    }

    public Employees updateEmployee(Employees employee){
        Employees existingEmployee = employeeRepo.findById(employee.getEmpId()).orElse(null);
        existingEmployee.setEmpName(employee.getEmpName());
        existingEmployee.setEmpEmail(employee.getEmpEmail());
        existingEmployee.setEmpAddress(employee.getEmpAddress());
        return employeeRepo.save(existingEmployee);
    }

}
