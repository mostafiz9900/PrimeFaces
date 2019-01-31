package com.beSkilled.bean;

import com.beSkilled.entity.Student;
import com.beSkilled.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class StudentBean {

    private Student student;
    private StudentService service = new StudentService();
    private String[] completeCource;
    private List<Student> list;

    public void save() {
        String ss = "";
        for (String s : completeCource) {
            ss += s + " , ";
        }
        student.setSubject(ss);
        service.saveOrEdit(student);
    }

    public void del() {
        service.delete(student);
    }

    public void reset() {
        student = new Student();
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

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public String[] getCompleteCource() {
        return completeCource;
    }

    public void setCompleteCource(String[] completeCource) {
        this.completeCource = completeCource;
    }

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

}
