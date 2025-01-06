<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register for Exam</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Register for Exam</h2>
        <form id="registerForm" action="RegisterServlet" method="post">
            <div class="mb-3">
                <label for="studentId">Student ID:</label>
                <input type="text" id="studentId" name="studentId" placeholder="Student ID" required>
            </div>
            <div class="mb-3">
                <label for="studentName">Student Name:</label>
                <input type="text" id="studentName" name="studentName" placeholder="Student Name" required>
            </div>
            <div class="mb-3">
                <label for="examCenter">Exam Center:</label>
                <select id="examCenter" name="examCenter" required>
                    <option value="NIT, Delhi">NIT, Delhi</option>
                    <option value="IDS-2, Noida">IDS-2, Noida</option>
                    <option value="JJK, Kanpur">JJK, Kanpur</option>
                </select>
            </div>
            <button type="submit">Register</button>
        </form>
        <h3 id="resultOutput"></h3>
    </div>
    <script>
        document.getElementById("registerForm").addEventListener("submit", function(event) {
            event.preventDefault();
            const studentId = document.getElementById("studentId").value;
            const studentName = document.getElementById("studentName").value;
            const examCenter = document.getElementById("examCenter").value;
            alert(`Student Registered: ${studentName} (ID: ${studentId}) at ${examCenter}`);
        });
    </script>
</body>
</html>
