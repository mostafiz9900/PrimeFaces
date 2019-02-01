package com.beSkilled.bean;

import com.beSkilled.entitly.Student;
import com.beSkilled.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class StudentBean {

    private StudentService service = new StudentService();
    private Student student;
    private List<Student> list;
    private String[] compliteCourse;

    public void save() {
        String ss = "";
        for (String s : compliteCourse) {
            ss += s + " , ";

        }
        student.setSubject(ss);
        service.saveOredit(student);
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

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCompliteCourse() {
        return compliteCourse;
    }

    public void setCompliteCourse(String[] compliteCourse) {
        this.compliteCourse = compliteCourse;
    }

}
