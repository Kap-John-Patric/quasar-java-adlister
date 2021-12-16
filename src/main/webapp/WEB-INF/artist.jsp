<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
    <style>
        body {
            background-image: url("/images/concertBg.jpeg");
            opacity: .99;
            background-size: cover;
            background-repeat: no-repeat !important;
            background-attachment: fixed;
            background-position: bottom;
            color: rgb(234, 234, 234);
        }
        div {
            background-color: #731ddd;
            opacity: .85;
        }
        .btn {
            background-color: #39047c;
            color: rgb(234, 234, 234);
        }
    </style>
</head>
<body>

<%--    Bootstrap form with valid/invalid inputs--%>
<form action="/artist-register" method="post" class="needs-validation" novalidate>
    <div class="form-row">
        <div class="col-md-4 mb-3">

            <label for="validationCustom01">First name</label>
            <input name="firstName" type="text" class="form-control" id="validationCustom01" placeholder="First name" required>
            <div class="invalid-feedback">
                Please provide your first name.
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <label for="validationCustom02">Last name</label>
            <input name="lastName" type="text" class="form-control" id="validationCustom02" placeholder="Last name" required>
            <div class="invalid-feedback">
                Please enter your last name.
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <label for="validationCustomUsername">Username</label>
            <div class="input-group">
                <input name="userName" type="text" class="form-control" id="validationCustomUsername" placeholder="Username" required>
                <div class="invalid-feedback">
                    Please Enter your Username.
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <label for="validationCustomPassword">Password</label>
            <input name="password" id="validationCustomPassword" class="form-control" type="password" placeholder="Password" required>
            <div class="invalid-feedback">
                Please Enter a Password.
            </div>
        </div>

        <div class="col-md-4 mb-3">
            <label for="validationConfirm_password">Confirm Password</label>
            <input id="validationConfirm_password" name="confirmPassword" class="form-control" type="password" placeholder="Confirm Password">
        <div class="invalid-feedback">
            Please confirm your password matches.
        </div>
        </div>
        <div class="col-md-4 mb-3">
            <label for="validationEmail">Email</label>
            <input name="eMail" id="validationEmail" class="form-control" type="text" placeholder="Email Address" required>
            <div class="invalid-feedback">
                Please enter an email.
            </div>
        </div>
    </div>
    <div class="col-md-12 mb-4">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
            <label class="form-check-label" for="invalidCheck">
                Agree to terms and conditions
            </label>
            <div class="invalid-feedback">
                You must agree before submitting.
            </div>
        </div>
    </div>
    <div class="col-md-12 mb-3">
        <button class="btn" type="submit">Submit form</button>
    </div>

</form>

<script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function() {
        'use strict';
        window.addEventListener('load', function() {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>

</body>
</html>
