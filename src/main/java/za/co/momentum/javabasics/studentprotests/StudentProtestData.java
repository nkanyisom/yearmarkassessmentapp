package za.co.momentum.javabasics.studentprotests;

import java.util.Date;

public interface StudentProtestData {
    void countAnnualProtests(String data[], String fileLocation);
    String getAnnualProtestReport(Date startDate, Date endDate);
}
