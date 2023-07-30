<%@page import="com.jsp.Flight_Ticket_Booking_Project.dto.AdminAddFlight"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.Flight_Ticket_Booking_Project.dao.AdminAddFlightDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body
{
     background-color:black;
     background-repeat: no-repeat;
     background-size: cover;
}
</style>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

   <%
       AdminAddFlightDao dao=new AdminAddFlightDao();
   
      List<AdminAddFlight> addFlights=dao.getAllFlightDetails();
   %>
      <table class="table table-info table-striped">
  <thead>
  
  <tr>
  <th scope="col">FlightLogo</th>
  <th scope="col">FlightNumber</th>
  <th scope="col">FlightName</th>
  <th scope="col">Source</th>
  <th scope="col">Destination</th>
  <th scope="col">Departure</th>
  <th scope="col">Arrival</th>
  <th scope="col">EconomicPrice</th>
  <th scope="col">BusinessPrice</th>
  <th scope="col">Delete</th>
  <th scope="col">Update</th>
  </tr>
  </thead>
  
  <tbody>
  <%for(AdminAddFlight addFlight:addFlights) {%>
  <%if(addFlight.getFlightName().equalsIgnoreCase("Indigo") || addFlight.getFlightName().equalsIgnoreCase("AirIndia")
		  || addFlight.getFlightName().equalsIgnoreCase("AkashaAir")) {%>
  <tr>
  <td><img src="https://s1.1zoom.me/big0/623/430889-Kysb.jpg" width="40px" height="30px" alt="indigo" style="border-radius:50%"/></td>
  <td><%=addFlight.getFlightNumber() %></td>
  <td><%=addFlight.getFlightName() %></td>
  <td><%=addFlight.getFlightSource() %></td>
  <td><%=addFlight.getFlightDestination() %></td>
  <td><%=addFlight.getDepartureTime() %></td>
  <td><%=addFlight.getArrivalTime() %></td>
  <td><%=addFlight.getFlightEconomicPrice() %></td>
  <td><%=addFlight.getFlightBusinessPrice() %></td>
  <td><a href="deleteFlight?flightNumber=<%=addFlight.getFlightNumber()%>"><button style="color:blue">Delete</button></a></td>
  <td><a href="updateFlight?flightNumber=<%=addFlight.getFlightNumber()%>"><button style="color:blue">Update</button></a></td>
  </tr>
  <%} %>
  <%} %>
  </tbody>
  </table>
</body>
</html>