package za.co.momentum.javabasics.studentprotests;

import za.co.momentum.javabasics.filesprocessor.FileProcessor;
import za.co.momentum.javabasics.filesprocessor.FileProcessorImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentProtestDataImpl implements StudentProtestData {

    @Override
    public void countAnnualProtests(String data [], String fileLocation) {

        FileProcessor fileProcessor = new FileProcessorImpl();
        fileProcessor.writeData(data, fileLocation);


    }

    @Override
    public String getAnnualProtestReport(Date startDate, Date endDate) {
        return null;
    }
}
