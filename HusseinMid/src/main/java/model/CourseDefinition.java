package model;

import jakarta.persistence.*;

@Entity
@Table(name = "course_definition")
public class CourseDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_definition_id;
    private String course_definition_code;
    private String course_definition_description;
    private int course_id;

    public CourseDefinition() {
    }

    public CourseDefinition(int course_definition_id) {
        this.course_definition_id = course_definition_id;
    }

    public CourseDefinition(int course_definition_id, String course_definition_code, String course_definition_description, int course_id) {
        this.course_definition_id = course_definition_id;
        this.course_definition_code = course_definition_code;
        this.course_definition_description = course_definition_description;
        this.course_id = course_id;
    }

    public int getCourse_definition_id() {
        return course_definition_id;
    }

    public void setCourse_definition_id(int course_definition_id) {
        this.course_definition_id = course_definition_id;
    }

    public String getCourse_definition_code() {
        return course_definition_code;
    }

    public void setCourse_definition_code(String course_definition_code) {
        this.course_definition_code = course_definition_code;
    }

    public String getCourse_definition_description() {
        return course_definition_description;
    }

    public void setCourse_definition_description(String course_definition_description) {
        this.course_definition_description = course_definition_description;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}