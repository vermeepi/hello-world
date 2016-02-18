<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head><title>Hello World</title></head>
<body>
Hello World!<br/>
<%
    out.println("Your IP address is " + request.getRemoteAddr());
%>
</body>
</html>