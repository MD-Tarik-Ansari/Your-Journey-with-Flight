<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
   .gradient-custom-3 {
/* fallback for old browsers */
background: #84fab0;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5))
}
.gradient-custom-4 {
/* fallback for old browsers */
background: #84fab0;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1))
}
</style>
</head>
<body>
<%
    String msg=(String)request.getAttribute("message");
%>
       <section class="vh-100 bg-image"
  style="background-image: url('https://s1.1zoom.me/big0/623/430889-Kysb.jpg');">
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-6 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-3">Registration Form</h2>
              
              
              <form action="userRegister" method="post">
              
              
                <div class="form-outline mb-3 d-flex justify-content-center">
                  <input type="text" id="form3Example1cg" class="form-control-lg vw-100"
                  placeholder="Enter Your Name" name="username"/>
                  
                </div>

                <div class="form-outline mb-3 d-flex justify-content-center">
                  <input type="email" id="form3Example3cg" class="form-control-lg vw-100"  placeholder="Enter Your Email" name="useremail"/>
                  
                </div>

                <div class="form-outline mb-3 d-flex justify-content-center">
                  <input type="password" id="form3Example4cg" class="form-control-lg vw-100"  placeholder="Enter Your Password" name="userpassword"/>
                 
                </div>
                 
                 <%if(msg!=null) {%>
                <h6 style="color:red"><%=msg %></h6>
                
                <%} %>
                 <div class="form-outline mb-3 d-flex justify-content-center">
                  <input type="password" id="form3Example4cg" class="form-control-lg vw-100"  placeholder="Confirm Your Password" name="confirmPassword"/>
                 
                </div>
                <div class="d-flex justify-content-center">
                  <button type="submit"
                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
                </div>

                <p class="text-center text-muted mt-4 mb-0">If you have already an account? <a href="user.jsp"
                    class="fw-bold text-body"><u style="color:blue">Login here</u></a></p>

              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>