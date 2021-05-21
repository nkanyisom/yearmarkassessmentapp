package za.co.momentum.javabasics.dbconnection.model;

import za.co.momentum.javabasics.course.Course;


public class StudentEntity {

    private String studentNumber;
    private String firstName;
    private String lastName;
    private Course courseDetails;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(Course courseDetails) {
        this.courseDetails = courseDetails;
    }
}
