import java.sql.SQLException;

public class Main {
   public static void main(String[] args) {
       try {
           DAO sc = new DAO();
           sc.Student("Rohan", "rar@example.com", "9910876543");
           sc.Registration(1, "Maths");
           sc.AdmitCard(1, "Noida", "2024-11-10");
           sc.Result(1, "Math Exam", 85);
           sc.ResultsByStudentId(1);
           sc.close();
       } catch (SQLException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
}