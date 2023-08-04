package org.jsp.StudentManagementSystem.Repository;
import org.jsp.StudentManagementSystem.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
