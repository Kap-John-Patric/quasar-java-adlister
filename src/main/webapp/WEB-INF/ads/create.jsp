<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
    <style>
        body {
            /*background-color: #731ddd;*/
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
    <div class="container">
        <h1>Setup your next Concert</h1>
        <form action="/ads/create" method="post">
            <div class="form-group">
                <label for="groupName">Artist Name</label>
                <input id="groupName" name="groupName" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="title">Title</label>
                <input id="title" name="title" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <textarea id="description" name="description" class="form-control" type="text" placeholder="Include Concert Date, Location, Ticket Price"></textarea>
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>
