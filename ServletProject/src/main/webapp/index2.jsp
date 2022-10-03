<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="servlet1">  
Name:<input type="text" name="userName"/><br/>  
<input type="submit" value="go"/>  
</form>  

<%   out.println("Welcome to scriplet JSP");  %><br/>
<!-- expresion tag -->
<%= "Welcome to my expression tag" %><br/>
<!-- declaration tag -->
<%! String name="Adam"; %><br/>
<%=  "My name is "+name %><br/>
<%  out.println(name); %><br/>

<%!  int square(int x){ return x*x;} %>
<%= "Square of 5  "+square(5) %><br/>
<% out.println("The square of 5 is "+square(5)); %>



 
</body>
</html>