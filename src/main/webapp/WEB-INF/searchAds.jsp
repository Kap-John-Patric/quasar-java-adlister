<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads"/>
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

<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div class="container">
<h1>Here are all your searched for ads!</h1>
    <c:forEach var="searchAds" items="${ads}">
        <div class="col-md-6">
            <h2>${searchAds.title}</h2>
            <p>${searchAds.description}</p>
            <form action="/searchAds" method="post">
                <input type="hidden" name="concert_id" value="${ad.id}">
                <input class="btn btn-danger btn-sm" type="submit" value="Search">
            </form>
            <p>Hello!</p>
        </div>
    </c:forEach>
</div>
    </body>
  </html>
