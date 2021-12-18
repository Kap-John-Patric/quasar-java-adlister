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
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Setup your next Concert</h1>
        <form action="/ads" >
            <div class="form-group">
                <label for="group_name">Artist Name</label>
                <input id="group_name" name="group_name" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="title">Title</label>
                <input id="title" name="title" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="location">Location</label>
                <textarea id="location" name="location" class="form-control" type="text" placeholder=" Location"></textarea>
            </div>
            <div class="form-group">
                <label for="date">Date</label>
                <textarea id="date" name="date" class="form-control" type="text" placeholder=" Date"></textarea>
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <textarea id="price" name="price" class="form-control" type="text" placeholder=" Price"></textarea>
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>
