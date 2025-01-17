package com.nuwaish.students_management_hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nuwaish.students_management_hibernate.student.Student;
import com.nuwaish.students_management_hibernate.student.StudentRepository;

@SpringBootApplication
public class StudentsManagementHibernateApplication implements CommandLineRunner {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repository;

	@Override
	public void run(String... args) {
		LOGGER.info("Student id 10001 -> {}", repository.findById(10001L));

		LOGGER.info("Inserting -> {}", repository.save(new Student("Kaish Alam", "NK125376253")));

		LOGGER.info("Update 10003 -> {}", repository.save(new Student(10001L, "Name-Updated", "New-Passport")));

		repository.deleteById(10002L);

		LOGGER.info("All Users -> {}", repository.findAll());
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementHibernateApplication.class, args);
	}

}
