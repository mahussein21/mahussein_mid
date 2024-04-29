package model;

import jakarta.persistence.*;


@Entity
@Table( name ="academic")
public class AcademicUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int academic_id;
    private String academic_code;
    private String academic_name;
    private String academic_type;
    private String parent_id;

    public AcademicUnit() {
    }

    public AcademicUnit(int academic_id) {
        this.academic_id = academic_id;
    }

    public AcademicUnit(int academic_id, String academic_code, String academic_name, String academic_type, String parent_id) {
        this.academic_id = academic_id;
        this.academic_code = academic_code;
        this.academic_name = academic_name;
        this.academic_type = academic_type;
        this.parent_id = parent_id;
    }

    public int getAcademic_id() {
        return academic_id;
    }

    public void setAcademic_id(int academic_id) {
        this.academic_id = academic_id;
    }

    public String getAcademic_code() {
        return academic_code;
    }

    public void setAcademic_code(String academic_code) {
        this.academic_code = academic_code;
    }

    public String getAcademic_name() {
        return academic_name;
    }

    public void setAcademic_name(String academic_name) {
        this.academic_name = academic_name;
    }

    public String getAcademic_type() {
        return academic_type;
    }

    public void setAcademic_type(String academic_type) {
        this.academic_type = academic_type;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }
}
