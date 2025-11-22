package com.training.ws_app1.controller;

import com.training.ws_app1.entity.Emp;
import com.training.ws_app1.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;
    @GetMapping("/emps")
    public Iterable<Emp> getAll(){
        return empService.getAll();
    }

    @GetMapping("/emp")
    public  Emp getEmpById(@RequestParam Long id){
        return  empService.getEmpById(id);
    }

    @PostMapping("/emp")
    public boolean add(@RequestBody Emp emp){
        empService.add(emp);
        return true;
    }

    @DeleteMapping("/emp")
    public  boolean delete(@RequestParam Long id){
        empService.delete(id);
        return  true;
    }
}
