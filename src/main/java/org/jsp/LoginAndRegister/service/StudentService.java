package org.jsp.LoginAndRegister.service;

import java.util.List;

import org.jsp.LoginAndRegister.Entity.Student;

public interface StudentService {

    List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
