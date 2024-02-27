package com.example.vasanth.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vasanth.entity.Student;
import com.example.vasanth.repository.StudentRepository;
import com.example.vasanth.service.StudentService;


@Service
public class ServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public ServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

	
	
	
	
	
	
}
