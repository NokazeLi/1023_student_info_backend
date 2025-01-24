package org.jdsystem.studentinfobackend.repository;

import org.jdsystem.studentinfobackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
