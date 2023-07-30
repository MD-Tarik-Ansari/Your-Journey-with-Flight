<%@page import="com.jsp.Flight_Ticket_Booking_Project.dto.AdminAddFlight"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.Flight_Ticket_Booking_Project.dao.AdminAddFlightDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
   <jsp:include page="user-nav.jsp"></jsp:include>
   <%
      String source=request.getParameter("source");
     String destination=request.getParameter("destination");
     
       AdminAddFlightDao addFlightDao=new AdminAddFlightDao();
   
      List<AdminAddFlight> addFlights=addFlightDao.getFlightBySourceToDestination(source, destination);
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
  <th scope="col">BookFlight</th>
  </tr>
  </thead>
  
  <tbody>
  
                <!-- Its for Indigo -->
                
  <%for(AdminAddFlight addFlight:addFlights) {%>
  <%if(addFlight.getFlightName().equalsIgnoreCase("Indigo")) {%>
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
  <td><a href="user-book-flight.jsp?flightNumber=<%=addFlight.getFlightNumber()%>"><button style="color:blue">BookYourTicket</button></a></td>
  </tr>
  <%} %>
  
                  <!-- Its for AirIndia -->
  
  <%if(addFlight.getFlightName().equalsIgnoreCase("AirIndia")) {%>
  <tr>
  <td><img src="https://cdn.dnaindia.com/sites/default/files/styles/full/public/2018/05/17/683452-airindia.jpg" width="40px" height="30px" alt="airIndia" style="border-radius:50%"/></td>
  <td><%=addFlight.getFlightNumber() %></td>
  <td><%=addFlight.getFlightName() %></td>
  <td><%=addFlight.getFlightSource() %></td>
  <td><%=addFlight.getFlightDestination() %></td>
  <td><%=addFlight.getDepartureTime() %></td>
  <td><%=addFlight.getArrivalTime() %></td>
  <td><%=addFlight.getFlightEconomicPrice() %></td>
  <td><%=addFlight.getFlightBusinessPrice() %></td>
  <td><a href="user-book-flight.jsp?flightNumber=<%=addFlight.getFlightNumber()%>"><button style="color:blue">BookYourTicket</button></a></td>
  </tr>
  <%} %>
  
              <!-- Its for AkashaAir --> 
               
  <%if(addFlight.getFlightName().equalsIgnoreCase("AkashaAir")) {%>
  <tr>
  <td><img src="https://tse3.mm.bing.net/th?id=OIP.0UGBvc-CdWNgaSXTR5oabQHaEQ&pid=Api&P=0&h=180" width="40px" height="30px" alt="airIndia" style="border-radius:50%"/></td>
  <td><%=addFlight.getFlightNumber() %></td>
  <td><%=addFlight.getFlightName() %></td>
  <td><%=addFlight.getFlightSource() %></td>
  <td><%=addFlight.getFlightDestination() %></td>
  <td><%=addFlight.getDepartureTime() %></td>
  <td><%=addFlight.getArrivalTime() %></td>
  <td><%=addFlight.getFlightEconomicPrice() %></td>
  <td><%=addFlight.getFlightBusinessPrice() %></td>
  <td><a href="user-book-flight.jsp?flightNumber=<%=addFlight.getFlightNumber()%>"><button style="color:blue">BookYourTicket</button></a></td>
  </tr>
  <%} %>
  <%} %>
  </tbody>
  </table>
</body>
</html>