<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    .but{
        width: 50px;
        height: 20px;
        box-shadow: 5px 5px 3px #888888;
        background-color: orange;
    }
</style>
<body>
<h1>SSM用户管理</h1><br />
<form action="test/hello.do" method="post">
    Id:<input type="text" name="userId"/><br />
    姓名：<input type="text" name="userName"/><br />
    性别：<input type="text" name="userSex"/><br />
    <input type="submit" value="提交" />
</form>
</body>
</html>