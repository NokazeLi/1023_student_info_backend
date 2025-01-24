package org.jdsystem.studentinfobackend.service;

import org.jdsystem.studentinfobackend.model.Student;

public interface IStudentService {
    //修改学生信息接口
    Student updateStudent(Student student,Long id );
}
