package com.example.demoProject1.controller;

import com.example.demoProject1.entities.Employees;
import com.example.demoProject1.services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    //This is the controller class.rt

    @Autowired
    private EmpServices empServices;

    @PostMapping("/addEmployee")
    public Employees addEmployee(@RequestBody  Employees employee){
        return empServices.saveEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employees> addEmployees(@RequestBody List<Employees> employees){
        return empServices.saveAllEmp(employees);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Optional<Employees> getEmployeeById(@PathVariable int id){
        return empServices.getEmpById(id);
    }
    @GetMapping("/getAllEmployees")
    public List<Employees> getAllEmployees(){
        return empServices.getAllEmp();
    }
    @PutMapping("/updateEmployee")
    public Employees updateEmployee(@RequestBody Employees employee){

        return empServices.updateEmployee(employee);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        empServices.deleteEmp(id);
        return "Employee deleted successfully";
    }
}
