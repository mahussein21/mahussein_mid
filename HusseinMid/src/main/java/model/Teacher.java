package model;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacher_id;
    private String first_name;
    private String last_name;
    private String qualification;
    private int course_id;

    public Teacher() {
    }

    public Teacher(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Teacher(int teacher_id, String first_name, String last_name, String qualification, int course_id) {
        this.teacher_id = teacher_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.qualification = qualification;
        this.course_id = course_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}