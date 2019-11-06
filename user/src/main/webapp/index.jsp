<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>首页</title>
    <style>
        #title {
            font-size: large;
            background-color: lightskyblue;
        }
    </style>
</head>
<body>
<span id="title">用户管理</span>
<hr/>
<a href="http://www.baidu.com">百度一下</a>
<jsp:forward page="page/userList.jsp"/>
</body>
</html>
