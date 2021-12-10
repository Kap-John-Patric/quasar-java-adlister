<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to the Artist-lister!</h1>
    </div>
    <br>
    <div class="container">
        <h4>Returning user?</h4>
        <form action="/login">
            <input type="submit" class="btn btn-primary" value="Log In Here">
        </form>

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
<%--    <li><a href="/login">Login</a></li>--%>
<%--    <li><a href="/logout">Logout</a></li>--%>
<%--    <li><a href="/register">Register</a> </li>--%>
</body>
</html>
