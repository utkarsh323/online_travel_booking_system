<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Available Hotels</title>

    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="p-4">

<h2>Available Hotels</h2>

<table class="table table-bordered table-striped mt-3">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Location</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="h" items="${hotels}">
            <tr>
                <td>${h.id}</td>
                <td>${h.name}</td>
                <td>${h.location}</td>
                <td>${h.price}</td>
                <td>
                    <a href="bookHotel?id=${h.id}" class="btn btn-primary btn-sm">
                        Book
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
