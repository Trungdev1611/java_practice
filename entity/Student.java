package entity;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int classStudent;
    private boolean isLearnOnlineCourse;
    private List<String> listCourse;

    public Student() {
    }

    public Student(String name, int age, int classStudent, boolean isLearnOnlineCourse, List<String> listCourse) {
        this.name = name;
        this.age = age;
        this.classStudent = classStudent;
        this.isLearnOnlineCourse = isLearnOnlineCourse;
        this.listCourse = listCourse;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassStudent() {
        return this.classStudent;
    }

    public void setClassStudent(int classStudent) {
        this.classStudent = classStudent;
    }

    public boolean isIsLearnOnlineCourse() {
        return this.isLearnOnlineCourse;
    }

    public boolean getIsLearnOnlineCourse() {
        return this.isLearnOnlineCourse;
    }

    public void setIsLearnOnlineCourse(boolean isLearnOnlineCourse) {
        this.isLearnOnlineCourse = isLearnOnlineCourse;
    }

    public List<String> getListCourse() {
        return this.listCourse;
    }

    public void setListCourse(List<String> listCourse) {
        this.listCourse = listCourse;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student age(int age) {
        setAge(age);
        return this;
    }

    public Student classStudent(int classStudent) {
        setClassStudent(classStudent);
        return this;
    }

    public Student isLearnOnlineCourse(boolean isLearnOnlineCourse) {
        setIsLearnOnlineCourse(isLearnOnlineCourse);
        return this;
    }

    public Student listCourse(List<String> listCourse) {
        setListCourse(listCourse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name) && age == student.age && classStudent == student.classStudent
                && isLearnOnlineCourse == student.isLearnOnlineCourse && Objects.equals(listCourse, student.listCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, classStudent, isLearnOnlineCourse, listCourse);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", classStudent='" + getClassStudent() + "'" +
                ", isLearnOnlineCourse='" + isIsLearnOnlineCourse() + "'" +
                ", listCourse='" + getListCourse() + "'" +
                "}";
    }

}
