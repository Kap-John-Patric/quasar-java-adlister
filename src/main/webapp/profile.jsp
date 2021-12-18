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
        .btn {
            background-color: #39047c;
            color: rgb(234, 234, 234);
        }
    </style>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1 class="my-3 text-center">Your Profile</h1>
            <table class="table">
                <thread>
                <tr>
                    <th>Username</th>
                    <th>Firstname</th>
                    <th>LastName</th>
                    <th>Email</th>
                    <th>Artist Name</th>
                </tr>
                </thread>
                <c:forEach var="ad" items="${ads}">
                    <div class="col-md-6">
                        <h3>${ad.username}</h3>
                        <h3>${ad.firstname}</h3>
                        <h3>${ad.lastname}</h3>
                        <h3>${ad.email}</h3>
                        <h3>${ad.group_name}</h3>
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
            </table>
    </div>
</body>
</html>
