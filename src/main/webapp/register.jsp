<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
   <h3>用户注册</h3>
   <form name="frmreg" method="post"  action="user.do?op=register">
   
   用户名：<input name="username" type="text"/><br/>
   密码：<input name="password" type="password"/><br/>
      真实名字：<input name="realname" type="text"/><br/>
   <input type="submit" name="btnreg" value="注册"/>
   </form>
</body>
</html>