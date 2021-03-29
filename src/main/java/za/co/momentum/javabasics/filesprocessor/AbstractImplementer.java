package za.co.momentum.javabasics.filesprocessor;

import za.co.momentum.javabasics.student.Student;

public class AbstractImplementer extends FileProcessorAbstract {

    @Override
    String[] readFileData(String fileLocation) {
        return new String[0];
    }

    @Override
    void WriteObjectToFile(Student student, String fileLocation) {
    }

}
