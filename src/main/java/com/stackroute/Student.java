package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private  int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> sort_objects(List<Student> _list){
        Collections.sort(_list,new StudentSorter());
        return _list;
    }
}


class StudentSorter implements Comparator<Student>{


    @Override
    public int compare(Student student, Student t1) {

        if(student.getAge()==t1.getAge()) {
            if (student.getName().equals(t1.getName())) {
                return student.getId()-t1.getId();
            }
            return student.getName().compareTo(t1.getName());
        }

        return t1.getAge()-student.getAge();
    }
}



