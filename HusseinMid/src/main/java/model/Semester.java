package model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "semester")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int semester_id;

    private String semester_name;
    private Timestamp starting_date;
    private Timestamp end_date;



    public Semester() {
    }

    public Semester(int semester_id) {
        this.semester_id = semester_id;
    }

    public Semester(int semester_id, String semester_name, Timestamp starting_date, Timestamp end_date) {
        this.semester_id = semester_id;
        this.semester_name = semester_name;
        this.starting_date = starting_date;
        this.end_date = end_date;
    }

    public int getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(int semester_id) {
        this.semester_id = semester_id;
    }

    public String getSemester_name() {
        return semester_name;
    }

    public void setSemester_name(String semester_name) {
        this.semester_name = semester_name;
    }

    public Timestamp getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(Timestamp starting_date) {
        this.starting_date = starting_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }
}


