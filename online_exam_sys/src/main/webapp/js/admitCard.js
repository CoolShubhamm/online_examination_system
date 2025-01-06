document.getElementById("admitCardForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const studentId = document.getElementById("studentId").value;
    alert(`Admit Card Issued for Student ID: ${studentId}`);
});
