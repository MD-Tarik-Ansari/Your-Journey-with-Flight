<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;1,100;1,300&display=swap" rel="stylesheet">
<!-- Font Awesome -->
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
  font-size: 1.50rem;
  letter-spacing: 1px;
}
.img-fluid
{
   max-width: 100%;
   height: auto;
   margin-top:14vh; 
}
.flight
{
    background-image:url("https://s1.1zoom.me/big0/623/430889-Kysb.jpg");
    background-repeat: no-repeat;
    background-size: cover;
}
.sectiontag
{
    height: 300px;
    width:400px;
   margin-left:50px;
     margin-top:150px;
}
.sectiontag p
{
    text-align: center;
    font-size: 40px;
    color: #485c73;
    font-family: 'Roboto', sans-serif;
}
.sectiontag button
{
   color:red;
}
</style>
</head>
<body class="flight">
     <header>
  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-light fixed-top mask-custom shadow-0">
    <div class="container">
      <a class="navbar-brand" href="#!"><span style="color: white;">FlightBookingSystem</span></a>
      <button class="navbar-toggler" type="button" data-mdb-toggle="collapse"
        data-mdb-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
        aria-label="Toggle navigation">
        <i class="fas fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto">
          <li class="nav-item">
            <a class="nav-link" href="home.jsp"><span style="color: white;">Home</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="admin.jsp"><span style="color: white;">AdminLogin</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="user.jsp"><span style="color: white;">UserLogin</span></a>
          </li>
          
          
        </ul>
        <ul class="navbar-nav d-flex flex-row">
          <li class="nav-item me-3 me-lg-0">
            <a class="nav-link" href="www.facebook.com">
              <i class="fab fa-facebook" style="color: blue;"></i>
            </a>
          </li>
          <li class="nav-item me-3 me-lg-0">
            <a class="nav-link" href="www.instagram.com">
              <i class="fab fa-instagram" style="color: #fb02dc;"></i>
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- Navbar -->

  <!--Section: Design Block-->
  <section class="sectiontag">
    <p>Start Your Journey with us...</p></br>
    <center><button style="color:white"><a href="user.jsp">Book-Flight</a></button></center>
  </section>
  <!--Section: Design Block-->
</header>
           
</body>
</html>