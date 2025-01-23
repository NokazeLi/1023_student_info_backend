package org.jdsystem.studentinfobackend.sevice;

import org.jdsystem.studentinfobackend.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<String> getStudents();

    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);


}
