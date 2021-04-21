package za.co.momentum.javabasics.studentprotests;

import za.co.momentum.javabasics.filesprocessor.FileProcessor;
import za.co.momentum.javabasics.filesprocessor.FileProcessorImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentProtestDataCorrectionImpl implements StudentProtestDataCorrection {

    @Override
    public void countAnnualProtests(String data [], String fileLocation) {

        FileProcessor fileProcessor = new FileProcessorImpl();
        fileProcessor.writeData(data, fileLocation);

    }

    @Override
    public String[] getAnnualProtestReport(String startDate, String endDate, String fileLocation) {

        FileProcessor fileProcessor = new FileProcessorImpl();
        String [] protestData = fileProcessor.readFileData(fileLocation);
        String [] protestDataReport = null;
        int cnt = 0;
        for(int a = 0;a < protestData.length;a++) {
            //[0] 10-02-2020,20-02-2020,ALL,Registration Blockage due to outstanding fees
            // to solve it --> 1:  Use .contains
            // 2: we are going to use a substring method to extract the start date and the end date.

            if(startDate.contains(protestData[a]) && endDate.contains(protestData[a])) {

                protestDataReport[cnt] = protestData[a];
                cnt++;
                }

/*            if (protestData[a].substring(0,10) == startDate && protestData[a].substring(12,21) == startDate) {
                protestDataReport[cnt] = protestData[a];
                cnt++;

            }*/


        }



        return protestDataReport;
    }

}
