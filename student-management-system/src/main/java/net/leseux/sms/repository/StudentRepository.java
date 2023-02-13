package net.leseux.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.leseux.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
