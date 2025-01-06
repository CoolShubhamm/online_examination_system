document.getElementById("publishResultForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const studentId = document.getElementById("studentId").value;
    const resultOutput = `Result for Student ID ${studentId}: 85 marks`; // Example result
    document.getElementById("resultOutput").innerText = resultOutput;
});
