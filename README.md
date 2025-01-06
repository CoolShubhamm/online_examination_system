Online Exam System

This project is an online exam management system that allows the registration of students, issuance of admit cards, and publication of exam results. The system is built using Java Servlets, JSP, MySQL for backend logic and Bootstrap for frontend design. It integrates various technologies to offer a simple yet functional solution.


---

Features

Student Registration: Allows students to register for exams by providing their details.

Admit Card Issuance: Issuance of admit cards based on student ID.

Result Publication: Publish exam results for individual students.

Bootstrap UI: A clean and responsive user interface built using Bootstrap for seamless access across devices.



---

Technologies Used

Java: Backend programming language used for implementing core logic.

MySQL: Database management system for storing student details, exam registrations, and results.

Servlets: Used to handle HTTP requests and perform backend logic.

JSP: Java Server Pages for creating dynamic web pages.

Bootstrap: Framework for developing a responsive and user-friendly frontend.

Maven: Tool for managing project dependencies and building the project.



---

HTML, CSS, and JavaScript Files

HTML: The structure of the user interface, containing forms for student registration, admit card generation, and result publication.

CSS: Custom styles to make the UI visually appealing, and Bootstrap for responsive design.

JavaScript: Handles client-side functionality like form validation and interactivity.



---

Getting Started

Prerequisites

Java 8 or higher

MySQL server

Maven

Apache Tomcat or any other Servlet/JSP container



---

Steps to Run

1. Clone the repository to your local machine:

Use git clone or download the ZIP file.



2. Set up the MySQL database:

Import the SQL_queries.sql file into your MySQL server to create necessary tables for student details, exam registrations, and results.



3. Configure your database connection:

Edit the DAO.java class to set up the connection to your MySQL database (specify database URL, username, and password).



4. Build the project using Maven:

Navigate to the project directory and run the following command:

mvn clean install



5. Deploy the project on your Servlet container:

Deploy the project to your server (e.g., Apache Tomcat).

Access the project by visiting the server's URL.


Project Structure

online_exam_sys/
│
├── .vscode/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── example/
│   │   │   │       ├── JDBC.java
│   │   │   │       ├── DAO.java
│   │   │   │       ├── RegisterServlet.java
│   │   │   │       ├── AdmitCardServlet.java
│   │   │   │       ├── PublishResultServlet.java
│   │   │   │       └── Main.java
│   │   ├── resources/
│   │   │   └── init.sql
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       │   └── web.xml
│   │       ├── META-INF/
│   │       ├── index.jsp
│   │       ├── register.jsp
│   │       ├── admitCard.jsp
│   │       ├── publishResult.jsp
│   │       ├── css/
│   │       │   └── style.css
│   │       ├── js/
│   │       │   ├── script.js
│   │       │   ├── admitCard.js
│   │       │   ├── publishResult.js
│   │       │   └── register.js
│   │       ├── register.html
│   │       ├── admitCard.html
│   │       └── result.html
│
├── target/
│   ├── classes/
│   │   ├── com/
│   │   │   └── example/
│   │   │       ├── AdmitCardServlet.class
│   │   │       ├── DAO.class
│   │   │       ├── JDBC.class
│   │   │       ├── Main.class
│   │   │       ├── PublishResultServlet.class
│   │   │       └── RegisterServlet.class
│   ├── generated-sources/
│   ├── maven-archiver/
│   ├── maven-status/
│   ├── online_exam_sys.war
│   └── test-classes/
│
├── lib/
│   ├── mysql-connector-java-8.x.x.jar
│   ├── protobuf-java-3.19.4.jar
│
├── pom.xml
├── SQL_queries.sql
└── test/
    └── DAOTest.java
