<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
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
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to Live and Local</h1>
    </div>
    <br>
    <div class="container">
        <h4 >Register here to join as a customer and find your next artist's concert!</h4>
        <form action="/register">
            <input type="submit" class="btn btn-primary" value="Customer Registration">
        </form>
    </div>
    <br>
    <div class="container">
        <h4 >Register here if you are an Artist and want to create your own Ad and start building your new FanBase!</h4>
        <form action="/artist-register">
            <input type="submit" class="btn btn-primary" value="Artist Registration">
        </form>
    </div>
    <br>
    <div class="container">
        <h4>Returning user?</h4>
        <form action="/login">
            <input type="submit" class="btn" value="Log In Here">
        </form>
    </div>
</body>
</html>
