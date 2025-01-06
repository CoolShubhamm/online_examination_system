package com.example;
import java.util.Scanner;

public class MAINS { // Main class

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DAO dao = new DAO();  // Instantiate DAO class to use its methods

        while (true) {
            System.out.println("\n--- Exam Management System ---");
            System.out.println("1. Register for Exam");
            System.out.println("2. Issue Admit Card");
            System.out.println("3. Publish Result");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            int studentId;  // Declaring studentId here so it's accessible in all cases
            switch (choice) {
                case 1: // Register for Exam
                    System.out.print("Enter Student ID (Available IDs: 1-10): ");
                    studentId = scanner.nextInt();
                    scanner.nextLine();  // Consume the leftover newline character

                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter Exam Center (1. NIT, Delhi, 2. IDS-2, Noida, 3. JJK, Kanpur): ");
                    int centerChoice = scanner.nextInt();
                    String examCenter = dao.getExamCenter(centerChoice);

                    // Call the DAO method to register the student
                    dao.registerForExam(studentId, studentName, examCenter);
                    break;
                case 2: // Issue Admit Card
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    dao.issueAdmitCard(studentId);  // Issue the admit card
                    break;
                case 3: // Publish Result
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    dao.publishResult(studentId);  // Publish the result
                    break;
                case 4: // Exit
                    System.out.println("Exiting the system...");
                    scanner.close();  // Close the scanner
                    return;  // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
