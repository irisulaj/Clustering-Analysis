/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iri_s
 */
public class Student {
    
    
                private String st_id;
                private String name;
                private String hours;
                private String grades;

    public Student(){
    }
    
    public Student(String id, String name, String hours, String grades){
            this.st_id = id;
            this.name = name;
            this.hours = hours;
            this.grades = grades;
    }
    public String getSt_id() {
        return st_id;
    }

    public void setSt_id(String st_id) {
        this.st_id = st_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
    
    
}
