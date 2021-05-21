package za.co.momentum.javabasics.dbconnection;

import za.co.momentum.javabasics.dbconnection.model.StudentEntity;
import za.co.momentum.javabasics.student.Student;

import java.sql.*;

public class DBConnection {

    private Connection connectToDB() throws SQLException {
        Connection conn = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "posgres")) {
            conn = connection;
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
        return conn;
    }


    public boolean insertStudent(StudentEntity student) throws SQLException {
        boolean isInserted = false;

        Connection conn = connectToDB();

        String SQL = "INSERT INTO cars(id, studentNumber, firstName, lastName, courseDetailsId) "
                + "VALUES(?,?,?,?,?)";

        PreparedStatement pstmt = conn.prepareStatement(SQL);
        double randomNumber = Math.random();
        int id = (int) randomNumber;

        pstmt.setInt(1, 2);
        pstmt.setString(2, student.getStudentNumber());
        pstmt.setString(3, student.getFirstName());
        pstmt.setString(4, student.getLastName());
        pstmt.setInt(5, 101);

        int affectedRows = pstmt.executeUpdate();

        return isInserted;
    }

}
