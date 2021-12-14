<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>
        <form action="/profile" method="post">
        <div class ="form-group">
            <label for="artist">Artist Name</label>
            <input id="artist" name="artist" class="form-control" type="text">
        </div>
            <div class ="form-group">
                <label for="genre">Genre</label>
                <input id="genre" name="genre" class="form-control" type="text">
            </div>
            <div class ="form-group">
                <label for="concert_date">Concert Dates</label>
                <input id="concert_date" name="concert_date" class="form-control" type="text" placeholder="YEAR-MM-DD">
            </div>
            <div class ="form-group">
                <label for="location">Locations</label>
                <input id="location" name="location" class="form-control" type="text">
            </div>
            <div class ="form-group">
                <label for="ticket_price">Ticket Price</label>
                <input id="ticket_price" name="ticket_price" class="form-control">
            </div>
            <br>
            <input type="submit" class="btn btn-primary btn-block">
        </form>
    </div>
    <div class="container">
        <h1>Here are all the Concerts!</h1>

        <c:forEach var="concert" items="${concert}">
            <div>
                <h2>${concert.username}</h2>
                <p>${concert.email}</p>
            </div>
        </c:forEach>
    </div>
</body>
</html>
