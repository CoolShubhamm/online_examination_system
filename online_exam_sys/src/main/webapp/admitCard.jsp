<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Issue Admit Card</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Issue Admit Card</h2>
        <form id="admitCardForm" action="AdmitCardServlet" method="post">
            <div class="mb-3">
                <input type="text" id="studentId" name="studentId" placeholder="Student ID" required><br><br>
            </div>
            <button type="submit">Issue Admit Card</button>
        </form>
        <h3 id="resultOutput"></h3>
    </div>
    <script>
        document.getElementById("admitCardForm").addEventListener("submit", function(event) {
            event.preventDefault();
            const studentId = document.getElementById("studentId").value;
            alert(`Admit Card Issued for Student ID: ${studentId}`);
        });
    </script>
</body>
</html>
