package za.co.momentum.javabasics.srccommittee;

import za.co.momentum.javabasics.student.Student;

public class SrcCommittee {

    private String campus;
    private String role;
    private Student student;

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
