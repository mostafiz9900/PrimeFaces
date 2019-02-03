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
 * @author Mostafizur
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    private StudentService service = new StudentService();
    private Student student;
    private List<Student> lists;
    private Student[] completCourse;

    public void save() {
        String sub = "";
        for (Student s : completCourse) {
            sub += s + " , ";

        }
        student.setSubject(sub);
        service.saveOrEdit(student);
    }

    public void del() {
        service.delete(student);
    }

    public void reset() {
        student = new Student();
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

    public List<Student> getLists() {
        lists = new ArrayList<>();
        lists = service.getList();
        return lists;
    }

    public void setLists(List<Student> lists) {
        this.lists = lists;
    }

    public Student[] getCompletCourse() {
        return completCourse;
    }

    public void setCompletCourse(Student[] completCourse) {
        this.completCourse = completCourse;
    }

}
