package com.greatlearning.srs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.srs.model.Student;
import com.greatlearning.srs.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	public void save(Student student) {
		  studentRepository.save(student);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}

}