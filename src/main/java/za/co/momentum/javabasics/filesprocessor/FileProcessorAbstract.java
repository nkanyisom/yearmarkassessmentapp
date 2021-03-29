package za.co.momentum.javabasics.filesprocessor;

import za.co.momentum.javabasics.student.Student;

public abstract class FileProcessorAbstract {

    String fileLocation;

    abstract String [] readFileData(String fileLocation);
    abstract void WriteObjectToFile(Student student, String fileLocation);

    public void setFileLocation(String remoteFileLocation) {
        fileLocation = remoteFileLocation;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    // i want to process some files

}
