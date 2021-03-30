package za.co.momentum.javabasics.studentprotests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentProtestDataImpl implements StudentProtestData {


    @Override
    public void countAnnualProtests (Date startDate, Date endDate, String campus, String reason) {

    }

    @Override
    public String getAnnualProtestsReport(Date startDate, Date endDate) {

        String fileLocation = "src/main/resources/studentProtestData.txt";
        int count = 0;
        BufferedReader reader;
        List<String> studentProtestData = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileLocation));
            String line = reader.readLine();
            while(line != null) {
                line = reader.readLine();
                studentProtestData.add(line);
                count++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] studentProtest = studentProtestData.toArray(new String[studentProtestData.size()]);


        return studentProtest;
    }
}
/*
    BufferedReader abc = new BufferedReader(new FileReader(myfile));
    List<String> lines = new ArrayList<String>();

while((String line = abc.readLine()) != null) {
        lines.add(line);
        System.out.println(data);
        }
        abc.close();

// If you want to convert to a String[]
        String[] data = lines.toArray(new String[]{});*/
