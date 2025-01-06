CREATE DATABASE exam_management;
USE exam_management;


CREATE TABLE  students (
    id INT PRIMARY KEY,                  
    marks INT,                            
    exam_name VARCHAR(100)                
);


INSERT INTO students (id, marks, exam_name) VALUES
(1, 85, 'JEE 2025'),
(2, 90, 'JEE 2025'),
(3, 75, 'JEE 2025'),
(4, 88, 'JEE 2025'),
(5, 80, 'JEE 2025'),
(6, 92, 'JEE 2025'),
(7, 78, 'JEE 2025'),
(8, 85, 'JEE 2025'),
(9, 80, 'JEE 2025'),
(10, 95, 'JEE 2025');


CREATE TABLE  student_registration (
    id INT PRIMARY KEY,                  
    name VARCHAR(100),                    
    exam_name VARCHAR(100),
    exam_center VARCHAR(255),             
    exam_date DATE,                       
    FOREIGN KEY (id) REFERENCES students(id)  
);


CREATE TABLE  admit_card (
    id INT PRIMARY KEY AUTO_INCREMENT,
    exam_name VARCHAR(100),
    exam_center VARCHAR(255),
    exam_date DATE
);



CREATE TABLE  result (
    id INT PRIMARY KEY AUTO_INCREMENT,
    marks INT
);


