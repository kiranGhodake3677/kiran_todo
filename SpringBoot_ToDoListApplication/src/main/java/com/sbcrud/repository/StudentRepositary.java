package com.sbcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.sbcrud.model.Student;
@Repository
public interface StudentRepositary extends CrudRepository<Student, Integer> {

}
