package za.co.momentum.javabasics.filesprocessor;

import za.co.momentum.javabasics.student.Student;

public interface FileProcessor {
    String [] readFileData(String fileLocation);
    void WriteObjectToFile(Student student, String fileLocation);
    void writeData(String data[], String fileLocation);

}
