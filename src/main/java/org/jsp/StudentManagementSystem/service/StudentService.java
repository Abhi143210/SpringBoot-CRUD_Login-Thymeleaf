package org.jsp.StudentManagementSystem.service;

import java.util.List;

import org.jsp.StudentManagementSystem.Entity.Student;

public interface StudentService {

    List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
