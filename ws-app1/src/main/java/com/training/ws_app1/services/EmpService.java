package com.training.ws_app1.services;

import com.training.ws_app1.entity.Emp;
import com.training.ws_app1.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public void add(Emp emp){
        if(empRepository.existsById(emp.getId())){
            System.out.println("Emp already exists");
        }
        empRepository.save(emp);

    }

    public  Emp getEmpById(Long id){
        Optional<Emp> empDb = empRepository.findById(id);
        if(empDb.isPresent()){
            return empDb.get();
        }
        return null;
    }
    public Iterable<Emp> getAll(){
        return  empRepository.findAll();
    }

    public  void delete(Long id){
         empRepository.deleteById(id);
    }
}
