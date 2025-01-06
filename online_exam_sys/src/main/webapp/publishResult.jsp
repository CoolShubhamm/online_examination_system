<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Publish Result</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Publish Result</h2>
        <form id="publishResultForm" action="PublishResultServlet" method="post">
            <div class="mb-3">
                <input type="text" name="studentId" id="studentId" placeholder="Student ID" required><br><br>
            </div>
            <button type="submit">Publish Result</button>
        </form>
        <h3 id="resultOutput"></h3>
    </div>
    <script>
        document.getElementById("publishResultForm").addEventListener("submit", function(event) {
            event.preventDefault();
            const studentId = document.getElementById("studentId").value;
            const resultOutput = `Result for Student ID ${studentId}: 85 marks`; // Example result
            document.getElementById("resultOutput").innerText = resultOutput;
        });
    </script>
</body>
</html>
