package com.training.ws_app1.repository;

import com.training.ws_app1.entity.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<Emp,Long> {
}
