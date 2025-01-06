import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.*;

public class DAOTest {

    private DAO dao;

    @BeforeEach
    public void setUp() {
        dao = new DAO();  // Create a new DAO object before each test
    }

    @Test
    public void testRegisterForExam() {
        int studentId = 1;
        String studentName = "John Doe";
        String examCenter = "NIT, Delhi";
        
        // Assuming you have a method to check if student registration is successful
        boolean result = dao.registerForExam(studentId, studentName, examCenter);
        assertTrue(result, "Registration should be successful");
    }

    @Test
    public void testIssueAdmitCard() {
        int studentId = 1;
        
        // Assuming you have a method that returns true if the admit card was issued
        boolean result = dao.issueAdmitCard(studentId);
        assertTrue(result, "Admit card should be issued successfully");
    }

    @Test
    public void testPublishResult() {
        int studentId = 1;
        
        // Assuming you have a method that checks if the result is published
        boolean result = dao.publishResult(studentId);
        assertTrue(result, "Result should be published successfully");
    }
}
