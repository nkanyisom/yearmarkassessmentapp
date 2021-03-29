package za.co.momentum.javabasics;

import za.co.momentum.javabasics.filesprocessor.FileProcessorImpl;
import za.co.momentum.javabasics.yearmarks.YearMarkAssessment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Year Mark Analyzer
 *
 */
public class YearMarkAnalyzer
{
    public static void main( String[] args )
    {

        FileProcessorImpl fileProcessorImpl = new FileProcessorImpl();
        YearMarkAssessment yearMarkAssessment = new YearMarkAssessment();

        String [] studentArrData = fileProcessorImpl.readFileData("src/main/resources/studentData.txt");
        String studentFullName [] = new String[studentArrData.length];
        int studentsYrMark [] = new int[studentArrData.length];
        String studentAssignmentMarks [] = new String[studentArrData.length];
        String studentExamMarkStatus [] = new String[studentArrData.length];

        //System.out.println("studentArrData.length: " + studentArrData.length);
        for(int a = 0;a < studentArrData.length-1; a++){

            String firstCmStr = studentArrData[a].substring(studentArrData[a].indexOf(",")+1);
            String firstName = studentArrData[a].substring(0,studentArrData[a].indexOf(",")).trim();
            //System.out.println("firstName: " + firstName);

            String scndtCmStr = firstCmStr.substring(firstCmStr.indexOf(",")+1).trim();

            String lastName = firstCmStr.substring(0,firstCmStr.indexOf(",")).trim();
            //System.out.println("lastName: " + lastName);


            int assignment_1 = Integer.valueOf(scndtCmStr.substring(0, scndtCmStr.indexOf(",")));
            //System.out.println(assignment_1);

            String trdtCmStr = scndtCmStr.substring(scndtCmStr.indexOf(",")+1).trim();
            //System.out.println(trdtCmStr);
            int assignment_2 = Integer.valueOf(trdtCmStr.substring(0, trdtCmStr.indexOf(",")));
            //System.out.println(assignment_2);

            String frthCmStr = trdtCmStr.substring(trdtCmStr.indexOf(",")+1).trim();
            //System.out.println(frthCmStr);
            int assignment_3 = Integer.valueOf(frthCmStr.substring(0, frthCmStr.indexOf(",")));
            //System.out.println(assignment_3);

            int yearMarkResult = yearMarkAssessment.calculateYearMark(assignment_1,assignment_2, assignment_3);

            String examMarkStatus = yearMarkAssessment.displayExamStatus(yearMarkResult);
            studentFullName[a] = firstName + " " + lastName;
            studentAssignmentMarks[a] = assignment_1 + " " + assignment_2 + " " + assignment_3;
            studentsYrMark[a] = yearMarkResult;
            studentExamMarkStatus[a] = examMarkStatus;


        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an alphabet to search by: ");
        final String fullNameAlphabet = scanner.nextLine();

        yearMarkAssessment.displayPreExamData(fullNameAlphabet, studentFullName, studentAssignmentMarks, studentsYrMark, studentExamMarkStatus);
        ArrayList<String> studentNameList = new ArrayList<String>();
        Collections.addAll(studentNameList, studentFullName);
        ArrayList<String> studentAssignmentMarksList = new ArrayList<String>();
        Collections.addAll(studentAssignmentMarksList, studentAssignmentMarks);

        ArrayList<Integer> studentsYrMarkList = IntStream.of(studentsYrMark)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> studentExamMarkStatusList = new ArrayList<String>();
        Collections.addAll(studentExamMarkStatusList, studentExamMarkStatus);
        yearMarkAssessment.displayPreExamData(fullNameAlphabet, studentNameList, studentAssignmentMarksList, studentsYrMarkList, studentExamMarkStatusList);

    /*    ArrayList<StudentMarkData> studentList = new ArrayList<StudentMarkData>();

        for(int a = 0; a < studentNameList.size() - 1;a++) {
            studentList.add(new StudentMarkData(studentNameList.get(a), studentsYrMarkList.get(a),studentAssignmentMarksList.get(a),studentExamMarkStatusList.get(a)));
        }*/

        // Use Java 8 foreach/stream.filter functions to print out student details
    }
}
