package org.jdsystem.studentinfobackend.sevice;


import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;

    @Override
    public List<Student>getStudents(){
        return studentRepository.findAll();
    }
    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public List<String> getStudents() {
        return List.of();
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public void deleteStudentById(Long id) {

    }
}
