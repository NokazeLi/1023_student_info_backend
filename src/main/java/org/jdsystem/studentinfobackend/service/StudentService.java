package org.jdsystem.studentinfobackend.service;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.exception.StudentAlreadyExistsException;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentService implements IStudentService{
    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        if (studentAlreadyExists(student.getEmail())){
            throw new StudentAlreadyExistsException(student.getEmail()+ " already exists");
        }
        return studentRepository.save(student);
    }

    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
