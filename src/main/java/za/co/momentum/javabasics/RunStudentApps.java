package za.co.momentum.javabasics;

import za.co.momentum.javabasics.filesprocessor.FileProcessor;
import za.co.momentum.javabasics.filesprocessor.FileProcessorImpl;
import za.co.momentum.javabasics.studentprotests.StudentProtestDataCorrection;
import za.co.momentum.javabasics.studentprotests.StudentProtestDataCorrectionImpl;


public class RunStudentApps {

    public static void main(String[] args) {

        String startDates[]  = {"10-02-2020","10-03-2020", "10-03-2020", "10-07-2020", "10-08-2020", "10-09-2020", "10-10-2020", "10-11-2020"};
        String endDates[]  = {"20-02-2020","20-03-2020", "20-04-2020", "20-07-2020", "20-08-2020", "20-09-2020", "20-10-2020", "20-11-2020"};
        String protestCampuses[]  = {"ALL","PRETORIA", "ALL", "BLOEMFONTEIN", "ROSEBANK", "POLOKWANE", "VAAL", "ALL"};
        String protestReasons[]  = {"Registration Blockage due to outstanding fees","Accomodation", "Fees Must fall", "Fees must fall", "Lack of Student support", "Resulsts held due to outstanding fees", "Fees Must fall", "Lack of security at Campuses"};

        FileProcessor fileProcessor = new FileProcessorImpl();
        String fileLocation = "src/main/resources/studentProtestData.txt";
        String data[] = new String[startDates.length+1];

        for(int a = 0;a< startDates.length; a++) {
            data[a] = startDates[a] + "," + endDates[a] + "," + protestCampuses[a]  + "," + protestReasons[a];
        }

        // call the implementation to do number 1
        StudentProtestDataCorrection studentProtestDataCorrection = new StudentProtestDataCorrectionImpl();
        studentProtestDataCorrection.countAnnualProtests(data, fileLocation);



        //Number 2:
        // read the data into a String Array, then filer according to the star and end date and store the index which has the corresponding start adn end date.
        //Please display the protest record for the 10-11-2020 to 20-11-2020



    }
}
