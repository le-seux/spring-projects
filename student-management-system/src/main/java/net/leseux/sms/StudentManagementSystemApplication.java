package net.leseux.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.leseux.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Student student1 = new Student("Leonardo", "Poppe", "leop@hotmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Jessica", "Gomes", "jessicag@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Tony", "Hawk", "tonihawk@gmail.com");
		studentRepository.save(student3);
		*/	
	}

}
