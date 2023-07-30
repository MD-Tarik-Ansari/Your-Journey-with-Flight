<%@page import="com.jsp.Flight_Ticket_Booking_Project.dto.AdminAddFlight"%>
<%@page import="com.jsp.Flight_Ticket_Booking_Project.dao.AdminAddFlightDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Flight</title>
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
  rel="stylesheet"
/>
<!-- Google Fonts -->
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<!-- MDB -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
  rel="stylesheet"
/>
<style>
.gradient-custom {
/* fallback for old browsers */
background: #f093fb;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to bottom right, rgba(240, 147, 251, 2), rgba(245, 87, 108, 1));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to bottom right, rgba(240, 147, 251, 2), rgba(245, 87, 108, 1))
}

.card-registration .select-input.form-control[readonly]:not([disabled]) {
font-size: 1rem;
line-height: 2.15;
padding-left: .75em;
padding-right: .75em;
}
.card-registration .select-arrow {
top: 10px;
}
/* Color of the links BEFORE scroll */
.navbar-scroll .nav-link,
.navbar-scroll .navbar-toggler-icon,
.navbar-scroll .navbar-brand {
  color: #fff;
}

/* Color of the links AFTER scroll */
.navbar-scrolled .nav-link,
.navbar-scrolled .navbar-toggler-icon,
.navbar-scrolled .navbar-brand {
  color: #fff;
}

/* Color of the navbar AFTER scroll */
.navbar-scroll,
.navbar-scrolled {
  background-color: #cbbcb1;
}

.mask-custom {
  backdrop-filter: blur(5px);
  background-color: rgba(255, 255, 255, .15);
}

.navbar-brand {
  font-size: 1.20rem;
  letter-spacing: 1px;
}
.form-control-lg
{
   height:40px;
   width:230px;
}
</style>
</head>
<body>
<%
   AdminAddFlightDao dao=new AdminAddFlightDao();
   int id=Integer.parseInt(request.getParameter("flightNumber"));
   AdminAddFlight flight=dao.getByFlightNumber(id);
%>
       <section class="vh-100 bg-image"
  style="background-image: url('https://s1.1zoom.me/big0/623/430889-Kysb.jpg');">
  
  <div class="container py-5 h-100">
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-4-strong card-registration" style="border-radius: 10px;">
          <div class="card-body p-4 p-md-4">
            <h3 class="mb-4 pb-4 pb-md-0 mb-md-4 align-items-center h-100 text-center">Update The Flight</h3>
            
        <form action="adminUpdateFlight" method="post">

              <div class="row">
                <div class="col-md-6 mb-3">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="number" id="firstName" class="form-control-lg" placeholder="Enter The Flight No." name="flightnumber" value="<%= flight.getFlightNumber()%>"/>
                    
                  </div>

                </div>
                
               <div class="col-md-6 mb-3">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="text" id="firstName" class="form-control-lg" placeholder="Enter The Flight Name." name="flightname" value="<%= flight.getFlightName()%>"/>
                    
                  </div>

                </div>
              </div>

              <div class="row">
               <div class="col-md-6 mb-3">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="text" id="lastName" class="form-control-lg" placeholder="Enter The source" name="flightSource" value="<%= flight.getFlightSource()%>"/>
                  </div>

                </div>
                <div class="col-md-6 mb-3 d-flex align-items-center">

                  <div class="form-outline datepicker w-100 d-flex justify-content-center">
                    <input type="text" class="form-control-lg" id="birthdayDate" placeholder="Enter The Destination" name="flightDestination" value="<%= flight.getFlightDestination()%>"/>
                  </div>

                </div>

                  
              </div>

              <div class="row">
              <div class="col-md-6 mb-3">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="time" id="lastName" class="form-control-lg" placeholder="Enter The Departure Time" name="flightDeparture" value="<%= flight.getDepartureTime()%>"/>

                  </div>

                </div>
                <div class="col-md-6 mb-3 pb-1">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="time" id="emailAddress" class="form-control-lg" placeholder="Enter The Arrival Time" name="flightArrival" value="<%= flight.getArrivalTime()%>"/>
                  </div>

                </div>
                
              </div>

              <div class="row">
                <div class="col-md-6 mb-3 pb-1">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="number" id="emailAddress" class="form-control-lg" placeholder="Enter Economic Price" name="flighteconomicPrice" value="<%= flight.getFlightEconomicPrice()%>"/>
                  </div>

                </div>
                 <div class="col-md-6 mb-3 pb-1">

                  <div class="form-outline d-flex justify-content-center">
                    <input type="number" id="emailAddress" class="form-control-lg" placeholder="Enter Business Price" name="flightbusinessPrice" value="<%= flight.getFlightBusinessPrice()%>"/>
                  </div>

                </div>
                <!-- <div class="col-md-6 mb-3 pb-1">

                  <div class="form-outline d-flex justify-content-center">
                  <select name="flightType" class="form-control-lg">
                  <option>Select Flight Type</option>
                  <option>Business</option>
                  <option>Economic</option>
                  </select>
                    
                  </div>

                </div>  -->
              </div>

              <div class="mt-2 pt-2 d-flex justify-content-center">
                <input class="btn btn-primary btn-lg" type="submit" value="Update Flight" />
              </div>

            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>