package org.jdsystem.studentinfobackend.service;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.exception.StudentAlreadyExistsException;
import org.jdsystem.studentinfobackend.exception.StudentNotFoundException;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentService implements IStudentService{
    private final StudentRepository studentRepository;

    //添加学生接口的业务逻辑
    @Override
    public Student addStudent(Student student) {
        if (studentAlreadyExists(student.getEmail())){
            throw new StudentAlreadyExistsException(student.getEmail()+ " already exists");
        }
        return studentRepository.save(student);
    }
    //查询所有学生接口的业务逻辑
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    //根据ID删除学生记录的接口的业务逻辑
    @Override
    public void  deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Sorry.student not found");
        }
        studentRepository.deleteById(id);
    }
    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }
}
