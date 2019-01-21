/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled.bean;

import com.beSkilled.entity.Student;
import com.beSkilled.service.StudentService;
import java.util.Date;
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
    private String[] subjectCompleted;

    public void save() {
        String ss = "";
        for (String s : subjectCompleted) {
            ss += s + " , ";

        }
        student.setSubject(ss);
        student.setRegDate(new Date());

       service.saveStudent(student);

    }
    public void update(){
        String ss = "";
        for (String s : subjectCompleted) {
            ss += s + " , ";

        }
        student.setSubject(ss);
        student.setRegDate(new Date());
    service.updateStudent(student);
    }
    public void del(){
    service.deleteStudent(student);
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

    public String[] getSubjectCompleted() {
        return subjectCompleted;
    }

    public void setSubjectCompleted(String[] subjectCompleted) {
        this.subjectCompleted = subjectCompleted;
    }

}
