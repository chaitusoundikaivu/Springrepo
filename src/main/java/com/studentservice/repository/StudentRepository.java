package com.studentservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentservice.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long>{

}