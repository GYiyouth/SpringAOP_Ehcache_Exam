<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: geyao
  Date: 2017/3/4
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户在线信息</title>
</head>
<body>
在线用户：
<table width="400" border="1">
    <%
        Map<String, String> online = (Map<String, String>)application.getAttribute("online");
        for (String sessionId:online.keySet())
        {%>
    <tr>
        <td><%=sessionId%>
        <td><%=online.get(sessionId)%>
    </tr>
    <%}%>
</table>
</body>
</html>
