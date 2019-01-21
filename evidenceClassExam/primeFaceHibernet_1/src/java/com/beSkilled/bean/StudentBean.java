/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.bean;

import com.beSkilled.entity.Student;
import com.beSkilled.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    private StudentService service = new StudentService();
    private Student student;
    private String[] completCourse;
    private List<Student> list;

    public void save() {
        String sbj="";
        for (String s : completCourse) {
            sbj += s + " , ";

        }
        student.setSubject(sbj);
        service.saveOrEdit(student);

    }

    public void del() {
        service.delete(student);

    }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();

        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCompletCourse() {
        return completCourse;
    }

    public void setCompletCourse(String[] completCourse) {
        this.completCourse = completCourse;
    }

    public List<Student> getList() {
        list=new ArrayList<>();
        list=service.getStudentList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

}
