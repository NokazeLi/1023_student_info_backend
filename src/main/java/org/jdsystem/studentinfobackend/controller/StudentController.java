package org.jdsystem.studentinfobackend.controller;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;
    @GetMapping("/get")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.FOUND);
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){

        System.out.println("打印"+student);
        return studentService.addStudent(student);
    }

}
