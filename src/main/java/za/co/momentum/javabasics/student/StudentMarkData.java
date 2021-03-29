package za.co.momentum.javabasics.student;

class StudentMarkData {
    String studentFullName;
    int studentsYrMark;
    String studentAssignmentMarks;
    String studentExamMarkStatus;

    public StudentMarkData(String studentFullName, int studentsYrMark, String studentAssignmentMarks, String studentExamMarkStatus) {
        this.studentFullName = studentFullName;
        this.studentsYrMark = studentsYrMark;
        this.studentAssignmentMarks = studentAssignmentMarks;
        this.studentExamMarkStatus = studentExamMarkStatus;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public int getStudentsYrMark() {
        return studentsYrMark;
    }

    public void setStudentsYrMark(int studentsYrMark) {
        this.studentsYrMark = studentsYrMark;
    }

    public String getStudentAssignmentMarks() {
        return studentAssignmentMarks;
    }

    public void setStudentAssignmentMarks(String studentAssignmentMarks) {
        this.studentAssignmentMarks = studentAssignmentMarks;
    }

    public String getStudentExamMarkStatus() {
        return studentExamMarkStatus;
    }

    public void setStudentExamMarkStatus(String studentExamMarkStatus) {
        this.studentExamMarkStatus = studentExamMarkStatus;
    }
}
