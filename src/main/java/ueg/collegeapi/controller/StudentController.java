package ueg.collegeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ueg.collegeapi.model.Student;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    @GetMapping
    public List<Student> listAll() {
        Student Student = new Student();
        Student.setId(1L);
        Student.setName("Wendel");
        Student.setRegisterNumber("00001");
        Student.setCourse("Programação Web I");
        Student.setRegisterDateTime(LocalDateTime.now());

        Student Student2 = ueg.collegeapi.model.Student
                .builder()
                .id(2L)
                .name("Aluno")
                .course("Programação Web I")
                .registerNumber("00002")
                .registerDateTime(LocalDateTime.now())
                .build();

        List<Student> Students = Arrays.asList(Student, Student2);
        return Students;
    }
}
