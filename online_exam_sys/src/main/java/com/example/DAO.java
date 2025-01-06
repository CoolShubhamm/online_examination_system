package com.example;
import java.sql.*;

public class DAO {

    // Method to register a student for the exam
    public boolean registerForExam(int studentId, String studentName, String examCenter) {
        try (Connection conn = JDBC.connect()) {
            String sql = "SELECT id, exam_name FROM students WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, studentId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        System.out.println("Student ID: " + rs.getInt("id"));
                        System.out.println("Exam Name: " + rs.getString("exam_name"));
                        String examDate = "2025-06-01"; // Example date
                        return registerStudentForExam(studentId, studentName, examCenter, examDate);
                    } else {
                        System.out.println("Invalid Student ID.");
                        return false;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to register a student for the exam
    private boolean registerStudentForExam(int studentId, String studentName, String examCenter, String examDate) {
        try (Connection conn = JDBC.connect()) {
            String sql = "INSERT INTO student_registration (id, name, exam_name, exam_center, exam_date) VALUES (?, ?, 'JEE 2025', ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, studentId);
                stmt.setString(2, studentName);
                stmt.setString(3, examCenter);
                stmt.setString(4, examDate);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Student registered successfully!");
                    return true;
                } else {
                    System.out.println("Registration failed.");
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to return exam center name
    public String getExamCenter(int choice) {
        switch (choice) {
            case 1: return "NIT, Delhi";
            case 2: return "IDS-2, Noida";
            case 3: return "JJK, Kanpur";
            default: return "Unknown Center";
        }
    }

    // Method to issue an admit card for a student
    public boolean issueAdmitCard(int studentId) {
        try (Connection conn = JDBC.connect()) {
            String sql = "SELECT * FROM student_registration WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, studentId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        String studentName = rs.getString("name");
                        String examName = rs.getString("exam_name");
                        String examCenter = rs.getString("exam_center");
                        String examDate = rs.getString("exam_date");

                        // Issue Admit Card
                        System.out.println("\nAdmit Card for " + studentName + ":");
                        System.out.println("Exam Name: " + examName);
                        System.out.println("Exam Center: " + examCenter);
                        System.out.println("Exam Date: " + examDate);

                        // Insert into admit_card table (without student_id)
                        String insertAdmitCardSQL = "INSERT INTO admit_card (exam_name, exam_center, exam_date) VALUES (?, ?, ?)";
                        try (PreparedStatement insertStmt = conn.prepareStatement(insertAdmitCardSQL)) {
                            insertStmt.setString(1, examName);
                            insertStmt.setString(2, examCenter);
                            insertStmt.setString(3, examDate);
                            int rowsAffected = insertStmt.executeUpdate();
                            if (rowsAffected > 0) {
                                System.out.println("Admit card issued and recorded successfully!");
                                return true; // Success
                            } else {
                                System.out.println("Failed to issue the admit card.");
                                return false; // Failure
                            }
                        }
                    } else {
                        System.out.println("Student not found for issuing admit card.");
                        return false;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to publish the result for a student
    public boolean publishResult(int studentId) {
        try (Connection conn = JDBC.connect()) {
            String sql = "SELECT marks FROM students WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, studentId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        int marks = rs.getInt("marks");
                        System.out.println("\nResult for Student ID " + studentId + ": " + marks + " marks.");

                        // Insert into result table (without student_id)
                        String insertResultSQL = "INSERT INTO result (marks) VALUES (?)";
                        try (PreparedStatement insertStmt = conn.prepareStatement(insertResultSQL)) {
                            insertStmt.setInt(1, marks);
                            int rowsAffected = insertStmt.executeUpdate();
                            if (rowsAffected > 0) {
                                System.out.println("Result published successfully!");
                                return true; // Success
                            } else {
                                System.out.println("Failed to publish the result.");
                                return false; // Failure
                            }
                        }
                    } else {
                        System.out.println("Student not found for publishing result.");
                        return false;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
