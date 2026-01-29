package com.crud.project.StudentController;

import com.crud.project.StudentModel.Student;
import com.crud.project.StudentRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
     StudentRepo repo;

    @GetMapping("/")
    public void Greet(){
        System.out.println("Hello");
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        List<Student> list=repo.findAll();
        return list;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Student student= repo.findById(id).get();
        return student;
    }

    @PostMapping("/AddStudent")
    public void AddStudent(@RequestBody Student student){
        System.out.println("Hello EveryOne!!");
        repo.save(student);
    }
    

}
