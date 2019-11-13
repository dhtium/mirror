<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>用户管理</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/upload" method="post" enctype="multipart/form-data">
    <label for="name">用户名</label><input id="name" type="text" name="name" value="peter"/><br/>
    <input name="file" type="file" value="上传图像"/>
    <input type="submit" value="提交"/>
</form>

Hello World
${requestScope.user.name}
</body>
</html>
