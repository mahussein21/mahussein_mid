package model;

import jakarta.persistence.*;

@Entity
@Table(name = "studentReg")

public class StudentReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int registration_id;
    private String registration_code;
    private String registration_date;
    private int student_id;
    private String semester_id;
    private int department_id;

    public StudentReg() {
    }

    public StudentReg(int registration_id) {
        this.registration_id = registration_id;
    }

    public StudentReg(int registration_id, String registration_code, String registration_date, int student_id, String semester_id, int department_id) {
        this.registration_id = registration_id;
        this.registration_code = registration_code;
        this.registration_date = registration_date;
        this.student_id = student_id;
        this.semester_id = semester_id;
        this.department_id = department_id;
    }

    public int getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(int registration_id) {
        this.registration_id = registration_id;
    }

    public String getRegistration_code() {
        return registration_code;
    }

    public void setRegistration_code(String registration_code) {
        this.registration_code = registration_code;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(String semester_id) {
        this.semester_id = semester_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}

