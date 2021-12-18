<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Register For Artist-Lister!"/>
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
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Please fill in your information.</h1>
    <form action="/ads/create" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="confirm_password">Confirm Password</label>
            <input id="confirm_password" name="confirm_password" class="form-control" type="password">
        </div>
        <div class="form-group">
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
        <input type="submit" class="btn btn-block">
    </form>
</div>
</body>
</html>
