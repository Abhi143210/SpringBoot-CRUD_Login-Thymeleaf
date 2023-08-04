package org.jsp.LoginAndRegister.Repository;
import org.jsp.LoginAndRegister.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
