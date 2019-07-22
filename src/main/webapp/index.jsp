<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setAttribute("rnum",12);
%>



</body>
<html>
<body>
<h1>main page</h1>
<h2><a href="Index">test index</a></h2>
<h2><a href="login.jsp">test login</a></h2>
<h2><a href="ueditor.jsp">测试富文本</a></h2>
</html>
