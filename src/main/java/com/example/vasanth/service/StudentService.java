package com.example.vasanth.service;

import java.util.List;

import com.example.vasanth.entity.Student;

//student service interface to hide the implementation
public interface StudentService {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
