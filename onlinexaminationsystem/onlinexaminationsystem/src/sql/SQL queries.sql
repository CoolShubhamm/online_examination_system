CREATE DATABASE EXAM;
USE EXAM;


CREATE TABLE Student (
    Student_Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Phone VARCHAR(15)
);

CREATE TABLE Registration (
    Registration_Id INT AUTO_INCREMENT PRIMARY KEY,
    Student_Id INT,
    Exam_Name VARCHAR(100),
    Registration_Date DATE,
    FOREIGN KEY (Student_Id) REFERENCES Student(Student_Id)
);

CREATE TABLE Admit_Card (
    Admit_Card_Id INT AUTO_INCREMENT PRIMARY KEY,
    Student_Id INT,
    Exam_Center VARCHAR(100),
    Exam_Date DATE,
    FOREIGN KEY (Student_id) REFERENCES Student(Student_Id)
);
CREATE TABLE Result (
    Result_id INT AUTO_INCREMENT PRIMARY KEY,
    Student_Id INT,
    Exam_Name VARCHAR(100),
    Marks INT,
    FOREIGN KEY (Student_Id) REFERENCES Student(Student_Id)
);


