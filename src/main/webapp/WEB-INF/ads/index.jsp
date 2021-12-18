<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Local Concerts</title>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
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
    <h1>Here are all the Concerts!</h1>
    <c:forEach var="ad" items="${ad.ads}">
        <div class="col-md-6">
            <h1>${ad.group_name}</h1>
            <h2>${ad.title}</h2>
                <p>${ad.location}</p>
                <p>${ad.date}</p>
                <p>${ad.price}</p>
            <form action="/ads/delete" method="post">
                <input type="hidden" name="concert_id" value="${ad.id}">
                <input class="btn btn-danger btn-sm" type="submit" value="Delete">
            </form>
            <form action="/ads/edit" method="post">
                <input type="hidden" name="concert_id" value="${ad.id}">
                <input class="btn btn-danger btn-sm" type="submit" value="Edit">
            </form>
        </div>
    </c:forEach>
</div>

</body>
</html>
