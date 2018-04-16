<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户界面</title>
</head>
<body>
	<form id="userListForm" action="${pageContext.request.contextPath }/userList/insertuserListSubmit.action" method="post" >

添加用户信息：
<table width="100%" border=1>
<tr>
	<td>登录名</td>
	<td><input type="text" name="userName"/></td>
</tr>
<tr>
	<td>登陆密码</td>
	<td><input type="text" name="password" /></td>
</tr>
<tr>
	<td>姓名</td>
	<td><input type="text" name="name" /></td>
</tr>

<tr>
	<td>用户交易量</td>
	<td><input type="text" name="userVolume" /></td>
</tr>

<tr>
	<td>银行卡号</td>
	<td><input type="text" name="cardNum"  /></td>
</tr>

<tr>
	<td>银行密码</td>
	<td><input type="text" name="cardPassward"/></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>

</body>
</html>