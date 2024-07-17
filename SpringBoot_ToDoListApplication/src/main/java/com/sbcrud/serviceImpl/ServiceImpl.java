package com.sbcrud.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbcrud.controller.StudentController;
import com.sbcrud.model.Student;
import com.sbcrud.repository.StudentRepositary;
import com.sbcrud.servicei.ServiceI;
@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	 StudentRepositary sr;

	@Override
	public void saveStudent(Student st) {
		
		sr.save(st);
	}
	
	
}
