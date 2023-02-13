package net.leseux.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.leseux.sms.entity.Student;
import net.leseux.sms.repository.StudentRepository;
import net.leseux.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
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

}
