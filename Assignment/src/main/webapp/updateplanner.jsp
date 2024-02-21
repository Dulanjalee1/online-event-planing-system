<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        <%
        
          String id = request.getParameter("event_Planner_id");
          String name = request.getParameter("event_Planner_name");
          String email = request.getParameter("event_Planner_email");
          String userName = request.getParameter("uname");
          String password = request.getParameter("pass");
          
        
        
          
        
        %>
   
  <form action ="Update" method = "post">
      event_Planner_id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name ="pid" value ="<%= id %>"readonly><br><br>
      event_Planner_name&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "name" value="<%= name %>"><br><br>
      event_Planner_email&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "email" value="<%= email %>"><br><br>
      username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "uname" value="<%= userName %>"><br><br>
      password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "password" name = "pass" value="<%= password %>"><br><br>
      <input type = "submit" name = "submit" value="Update my data"><br>
  </form>

</body>
</html>