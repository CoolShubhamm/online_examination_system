function registerStudent() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;

    if (name && email && phone) {
        const studentId = Math.floor(Math.random() * 1000) + 1;
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-danger");
        alertBox.classList.add("alert-success");
        alertBox.innerText = `Student registered successfully! ID: ${studentId}`;
    } else {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-success");
        alertBox.classList.add("alert-danger");
        alertBox.innerText = "Please fill all the fields correctly.";
    }
}

function registerForExam() {
    const studentId = document.getElementById("studentId").value;
    const examName = document.getElementById("examName").value;

    if (studentId && examName) {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-danger");
        alertBox.classList.add("alert-success");
        alertBox.innerText = `Exam registration successful for Student ID: ${studentId} for ${examName}`;
    } else {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-success");
        alertBox.classList.add("alert-danger");
        alertBox.innerText = "Please fill all the fields correctly.";
    }
}

function issueAdmitCard() {
    const studentId = document.getElementById("studentIdAdmit").value;
    const examCenter = document.getElementById("examCenter").value;
    const examDate = document.getElementById("examDate").value;

    if (studentId && examCenter && examDate) {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-danger");
        alertBox.classList.add("alert-success");
        alertBox.innerText = `Admit card issued for Student ID: ${studentId}`;
    } else {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-success");
        alertBox.classList.add("alert-danger");
        alertBox.innerText = "Please fill all the fields correctly.";
    }
}

function publishResult() {
    const studentId = document.getElementById("studentIdResult").value;
    const examName = document.getElementById("examName").value;
    const marks = document.getElementById("marks").value;

    if (studentId && examName && marks) {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-danger");
        alertBox.classList.add("alert-success");
        alertBox.innerText = `Result published for Student ID: ${studentId}`;
    } else {
        const alertBox = document.getElementById("responses");
        alertBox.classList.remove("d-none", "alert-success");
        alertBox.classList.add("alert-danger");
        alertBox.innerText = "Please fill all the fields correctly.";
    }
}
