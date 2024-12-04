import java.sql.*;

public class DAO {
    private Connection conn;

    public DAO() throws SQLException, ClassNotFoundException {
        conn = jdbc.getConnection();
    }

    public void Student(String name, String email, String phone) throws SQLException {
        String query = "INSERT INTO Student (name, Email, Phone) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                System.out.println("Registered Student ID: " + keys.getInt(1));
            }
        }
    }

    public void Registration(int studentId, String examName) throws SQLException {
        String query = "INSERT INTO Registration (Student_Id, Exam_Name, Registration_Date) VALUES (?, ?, CURDATE())";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.setString(2, examName);
            stmt.executeUpdate();
        }
    }

    public void AdmitCard(int studentId, String examCenter, String examDate) throws SQLException {
        String query = "INSERT INTO Admit_Card (Student_Id, Exam_Center, Exam_Date) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.setString(2, examCenter);
            stmt.setString(3, examDate);
            stmt.executeUpdate();
        }
    }

    public void Result(int studentId, String examName, int marks) throws SQLException {
        String query = "INSERT INTO Result (Student_Id, Exam_Name, Marks) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.setString(2, examName);
            stmt.setInt(3, marks);
            stmt.executeUpdate();
        }
    }

    public void ResultsByStudentId(int studentId) throws SQLException {
        String query = "SELECT Exam_Name, Marks FROM Result WHERE Student_Id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            try (ResultSet results = stmt.executeQuery()) {
                while (results.next()) {
                    System.out.println("Exam: " + results.getString("Exam_Name") + ", Marks: " + results.getInt("Marks"));
                }
            }
        }
    }

    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
