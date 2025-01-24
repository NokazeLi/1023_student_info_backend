package org.jdsystem.studentinfobackend.service;

import org.jdsystem.studentinfobackend.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    //修改学生信息接口
    Student updateStudent(Student student,Long id );
    void deleteStudent(Long id);
    Student getStudentById(Long id);



}
