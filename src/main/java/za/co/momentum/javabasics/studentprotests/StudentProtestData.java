package za.co.momentum.javabasics.studentprotests;

import java.util.Date;

public interface StudentProtestData {
    void countAnnualProtests(Date startDate, Date endDate, String campus, String reason);
    String getAnnualProtestsReport(Date startDate, Date endDate);

}
