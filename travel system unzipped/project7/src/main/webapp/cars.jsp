<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Available Cars</title>

    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="p-4">

<h2>Available Cars</h2>

<table class="table table-bordered table-striped mt-3">
    <thead>
    <tr>
        <th>ID</th>
        <th>Company</th>
        <th>Model</th>
        <th>Price</th>
        <th>Action</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="c" items="${cars}">
        <tr>
            <td>${c.id}</td>
            <td>${c.company}</td>
            <td>${c.model}</td>
            <td>${c.price}</td>
            <td>
                <a href="bookCar?id=${c.id}" class="btn btn-primary btn-sm">
                    Book
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
