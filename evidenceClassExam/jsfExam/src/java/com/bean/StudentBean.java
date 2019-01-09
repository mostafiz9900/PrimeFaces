/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entity.Student;
import com.service.StudentService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    private Student student;
    private String[] courseCompleated;

    public void save() {
        String cc = "";
        for (String s : courseCompleated) {
            cc += s + " , ";
            

        }
        student.setSubject(cc);
        StudentService service=new StudentService();
        service.saveOrEdit(student);
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

    public String[] getCourseCompleated() {
        return courseCompleated;
    }

    public void setCourseCompleated(String[] courseCompleated) {
        this.courseCompleated = courseCompleated;
    }

    

}
