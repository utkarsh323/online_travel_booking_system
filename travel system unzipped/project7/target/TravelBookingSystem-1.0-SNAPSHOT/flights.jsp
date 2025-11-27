<%@ page import="java.util.*, com.travel.model.Flight" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Flights</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="p-3">
<div class="container">
    <h2>Available Flights</h2>
    <table class="table table-striped">
        <thead><tr><th>ID</th><th>From</th><th>To</th><th>Date</th><th>Price</th><th>Action</th></tr></thead>
        <tbody>
        <%
            List<Flight> flights = (List<Flight>) request.getAttribute("flights");
            if (flights != null) {
                for (Flight f : flights) {
        %>
            <tr>
                <td><%= f.getId() %></td>
                <td><%= f.getSource() %></td>
                <td><%= f.getDestination() %></td>
                <td><%= f.getDate() %></td>
                <td><%= f.getPrice() %></td>
                <td><a class="btn btn-sm btn-success" href="bookFlight?id=<%= f.getId() %>">Book</a></td>
            </tr>
        <%      }
            } else { %>
            <tr><td colspan="6">No flights found.</td></tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
