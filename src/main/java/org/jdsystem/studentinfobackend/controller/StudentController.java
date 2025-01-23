package org.jdsystem.studentinfobackend.controller;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.sevice.IStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;

}
