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
<h1>Here Are all your searched for ads!</h1>
    <c:forEach var="searchedAds" items="${ads}">
        <div class="col-md-6">
            <h2>${searchedAds.title}</h2>
<%--            <p>${searchedAds.description}</p>--%>
            <form action="/WEB-INF/ads/searchAds" method="post">
                <input type="hidden" name="concert_id" value="${ad.id}">
                <input class="btn btn-danger btn-sm" type="submit" value="Search">
            </form>
            <p>Hello!</p>
        </div>
    </c:forEach>
    </div>
    </body>
  </html>
