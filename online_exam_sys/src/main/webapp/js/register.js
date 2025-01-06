document.getElementById("registerForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const studentId = document.getElementById("studentId").value;
    const studentName = document.getElementById("studentName").value;
    const examCenter = document.getElementById("examCenter").value;
    alert(`Student Registered: ${studentName} (ID: ${studentId}) at ${examCenter}`);
});
