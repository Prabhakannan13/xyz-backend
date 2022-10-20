package com.nestdigital.xyzbackend.Controller;

import com.nestdigital.xyzbackend.Dao.StudentDao;
import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/studententry",consumes="application/json",produces = "application/json")
    public String Studententry(@RequestBody StudentModel student){
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewstudent")
    public List<StudentModel>viewstudent(){
        return (List<StudentModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deletestudent",consumes = "application/json",produces = "application/json")
    public String deleteStudent(@RequestBody StudentModel student){
        dao.deleteStudentById(student.getId());
        return "{status:'success'}";
    }
}
