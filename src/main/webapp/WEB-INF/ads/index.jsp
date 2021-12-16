<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h1>${ad.groupName}</h1>
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
<%--            <p>${ad.location}</p>--%>
<%--            <p>${ad.concertDate}</p>--%>
<%--            <p>${ad.ticketPrice}</p>--%>
        </div>
    </c:forEach>
</div>

</body>
</html>
