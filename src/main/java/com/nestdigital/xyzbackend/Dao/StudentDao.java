package com.nestdigital.xyzbackend.Dao;

import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `id`=:id",nativeQuery = true)
    void deleteStudentById(Integer id);


    @Query(value = "SELECT `id`, `bloodgroup`, `college`, `department`, `dob`, `gaurdianaddress`, `gaurdianname`, `name`, `parentemailid`, `parentname`, `rollno` FROM `students` WHERE `name`=:name",nativeQuery = true)
    List<StudentModel>searchstudent(String name);
}
