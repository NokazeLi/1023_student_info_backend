package org.jdsystem.studentinfobackend.service;

import org.jdsystem.studentinfobackend.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    void deleteStudent(Long id);
}
