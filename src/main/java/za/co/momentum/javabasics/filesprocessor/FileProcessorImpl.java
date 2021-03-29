package za.co.momentum.javabasics.filesprocessor;

import za.co.momentum.javabasics.student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileProcessorImpl implements FileProcessor {

    @Override
    public String [] readFileData(String fileLocation) {
        BufferedReader reader;
        List<String> studentDataList = new ArrayList<String>();
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader(fileLocation));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                // read next line
                line = reader.readLine();
                studentDataList.add(line); //store record into String Array
                count++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String [] studentData = studentDataList.toArray(new String[studentDataList.size()]);;

        return studentData;
    }

/*    public void writeProtestData(Date startDate, Date endDate, String campus, String reason) throws IOException {
        String fileLocation = "src/main/resources/studentProtestData.txt";
        String protestData= startDate + ", " + endDate + ", " + campus + ", " + reason + " \n";

        writeData(protestData, fileLocation);;

    }*/

    @Override
    public void WriteObjectToFile(Student student, String fileLocation) {

        try {

            FileOutputStream fileOut = new FileOutputStream(fileLocation);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(student);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void writeData(String data[], String fileLocation) {
        try {
            File fout = new File(fileLocation);
            FileOutputStream fos = new FileOutputStream(fout);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for(int a = 0;a < data.length; a++){

                bw.write(data[a]);
                bw.newLine();
            }

            bw.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
