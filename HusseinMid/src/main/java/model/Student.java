package model;

import jakarta.persistence.*;




    @Entity
    @Table(name = "student")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String names;

        private String programs;

        public Student() {
        }

        public Student(int id, String names, String programs) {
            this.id = id;
            this.names = names;
            this.programs = programs;
        }

        public Student(int id) {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }

        public String getPrograms() {
            return programs;
        }

        public void setPrograms(String programs) {
            this.programs = programs;
        }
    }