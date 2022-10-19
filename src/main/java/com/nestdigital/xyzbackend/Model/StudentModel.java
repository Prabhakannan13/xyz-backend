package com.nestdigital.xyzbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollno;
    private String college;
    private String department;
    private String dob;
    private String bloodgroup;
    private String parentname;
    private String parentemailid;
    private String gaurdianname;
    private String gaurdianaddress;

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getParentemailid() {
        return parentemailid;
    }

    public void setParentemailid(String parentemailid) {
        this.parentemailid = parentemailid;
    }

    public String getGaurdianname() {
        return gaurdianname;
    }

    public void setGaurdianname(String gaurdianname) {
        this.gaurdianname = gaurdianname;
    }

    public String getGaurdianaddress() {
        return gaurdianaddress;
    }

    public void setGaurdianaddress(String gaurdianaddress) {
        this.gaurdianaddress = gaurdianaddress;
    }

    public StudentModel(int id, String name, int rollno, String college, String department, String dob, String bloodgroup, String parentname, String parentemailid, String gaurdianname, String gaurdianaddress) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.college = college;
        this.department = department;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.parentname = parentname;
        this.parentemailid = parentemailid;
        this.gaurdianname = gaurdianname;
        this.gaurdianaddress = gaurdianaddress;
    }
}
