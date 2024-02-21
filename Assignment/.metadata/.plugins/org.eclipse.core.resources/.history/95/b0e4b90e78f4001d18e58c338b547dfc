<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<title>Insert title here</title>
</head>
<body>
	      <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <!--  <a class="navbar-brand" href="#">Navbar</a>-->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown link
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
      
     <c:forEach var = "planner" items = "${eventDetails}">
     <c:set var ="id" value = "${planner.event_Planner_id}"/>
     <c:set var ="name" value = "${planner.event_Planner_name}"/>
     <c:set var ="email" value = "${planner.event_Planner_email}"/>
     <c:set var ="username" value = "${planner.username}"/>
     <c:set var ="password" value = "${planner.password}"/>
     
     ${planner.event_Planner_id}
     ${planner.event_Planner_name}
     ${planner.event_Planner_email}
     ${planner.username}
     ${planner.password}
      
    
     
     
     </c:forEach>
     <c:url value="updatePlanner.jsp" var="plannerUpdate">
     <c:param name="event_Planner_id" value="${id}"/>
     <c:param name="event_Planner_name" value="${name}"/>
     <c:param name="event_Planner_email" value="${email}"/>
     <c:param name="uname" value="${username}"/>
     <c:param name="pass" value="${password}"/>
     
     
     </c:url>
     
     
     <a href ="${plannerUpdate}">
     <input type = "button" name ="Update" value="Update my data">
</body>
</html>