package za.co.momentum.javabasics.yearmarks;

import java.util.ArrayList;

public class YearMarkAssessment {

    public int calculateYearMark(int assignemtn1,int assignemtn2,int assignemtn3){
        int finalYearMark = 0;

        //calculate the year mark
        finalYearMark = (assignemtn1 + assignemtn2 + assignemtn3) /3;
        return finalYearMark;
    }


        public void displayPreExamData(String fullNameAlphabet, String [] studentFullName, String [] studentAssignmentMarks, int [] studentsYrMark, String [] studentExamMarkStatus){

            //displays all students and their info
            for(int z = 0; z < studentFullName.length - 1; z++){
                if(studentFullName[z].startsWith(fullNameAlphabet)) {
                    System.out.println(studentFullName[z] + ", assignment marks: " + studentAssignmentMarks[z] + ", Year Mark: " + studentsYrMark[z] + ", Exam Mark Status: " + studentExamMarkStatus[z]);
                }
            }

        }

        public void displayPreExamData(String fullNameAlphabet, ArrayList<String> studentFullName, ArrayList<String>  studentAssignmentMarks, ArrayList<Integer>  studentsYrMark, ArrayList<String>  studentExamMarkStatus){

            //displays all students and their info, using Java 8 features
            for(int z = 0; z < studentFullName.size() - 1; z++) {
                if(studentFullName.get(z).startsWith(fullNameAlphabet)) {
                    System.out.println(studentFullName.get(z) + ", assignment marks: " + studentAssignmentMarks.get(z) + ", Year Mark: " + studentsYrMark.get(z) + ", Exam Mark Status: " + studentExamMarkStatus.get(z));
                }
            }
        }


    public String displayExamStatus(int yearMark) {
        return "";
    }



}
