package za.co.momentum.javabasics.yearmarks;

import za.co.momentum.javabasics.filesprocessor.FileProcessor;
import za.co.momentum.javabasics.filesprocessor.FileProcessorImpl;
import za.co.momentum.javabasics.student.Student;

public class StudentEnroller {

    public static void main(String[] args) {
        FileProcessor fileProcessorImpl = new FileProcessorImpl();

        Student student1 = new Student("0101", "Nkanyiso", "Malunga");

        fileProcessorImpl.WriteObjectToFile(student1,"src/main/resources/studentData.txt");
    }
}
