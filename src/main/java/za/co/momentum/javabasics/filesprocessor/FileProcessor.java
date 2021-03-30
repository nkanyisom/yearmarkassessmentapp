package za.co.momentum.javabasics.filesprocessor;

import za.co.momentum.javabasics.srccommittee.SrcCommittee;
import za.co.momentum.javabasics.student.Student;

import java.util.List;

public interface FileProcessor {
    String [] readFileData(String fileLocation);
    void WriteObjectToFile(Student student, String fileLocation);
    void writeData(String data[], String fileLocation);
    void writeSRCCommitteeDataToFile(SrcCommittee srcCommittee, String fileLocation);
    SrcCommittee readSRCCommitteeDataToFile(String fileLocation);

}
