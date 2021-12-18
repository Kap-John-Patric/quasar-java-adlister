<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Artist Profile" />
    </jsp:include>
    <style>
        body {
            background-image: url("images/concertBg.jpeg");
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
    </style>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Your Profile</h1>
<%--        <form action="/profile" method="post">--%>
<%--        <div class ="form-group">--%>
<%--            <label for="artist">Artist </label>--%>
<%--            <input id="artist" name="artist" class="form-control" type="text">--%>
<%--        </div>--%>
<%--            <div class ="form-group">--%>
<%--                <label for="genre">Genre</label>--%>
<%--                <input id="genre" name="genre" class="form-control" type="text">--%>
<%--            </div>--%>
<%--            <div class ="form-group">--%>
<%--                <label for="concert_date">Concert Dates</label>--%>
<%--                <input id="concert_date" name="concert_date" class="form-control" type="text" placeholder="YEAR-MM-DD">--%>
<%--            </div>--%>
<%--            <div class ="form-group">--%>
<%--                <label for="location">Locations</label>--%>
<%--                <input id="location" name="location" class="form-control" type="text">--%>
<%--            </div>--%>
<%--            <div class ="form-group">--%>
<%--                <label for="ticket_price">Ticket Price</label>--%>
<%--                <input id="ticket_price" name="ticket_price" class="form-control">--%>
<%--            </div>--%>
<%--            <br>--%>
<%--            <input type="submit" class="btn btn-primary btn-block">--%>
<%--        </form>--%>
    </div>
</body>
</html>
