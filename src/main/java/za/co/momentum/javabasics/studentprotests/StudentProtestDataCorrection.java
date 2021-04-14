package za.co.momentum.javabasics.studentprotests;

import java.util.Date;

public interface StudentProtestDataCorrection {
    void countAnnualProtests(String data[], String fileLocation);
    String [] getAnnualProtestReport(String startDate, String endDate, String fileLocation);
}
