<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>

</head>
<body> 

<!-- ${pageContext.request.contextPath }/userList/editUserListSubmit.action绝对路径提交 -->
<form id="userListForm" action="${pageContext.request.contextPath }/userList/editUserListSubmit.action" method="post" >
<input type="hidden" name="id" value="${userListCustom.userName }"/>
修改用户信息：
<table width="100%" border=1>
<tr>
	<td>登录名</td>
	<td><input type="text" name="userName" value="${userListCustom.userName }"/></td>
</tr>
<tr>
	<td>登陆密码</td>
	<td><input type="text" name="password" value="${userListCustom.password }"/></td>
</tr>
<tr>
	<td>姓名</td>
	<td><input type="text" name="name" value="${userListCustom.name}" /></td>
</tr>

<tr>
	<td>用户交易量</td>
	<td><input type="text" name="userVolume" value="${userListCustom.userVolume}" /></td>
</tr>

<tr>
	<td>银行卡号</td>
	<td><input type="text" name="cardNum" value="${userListCustom.cardNum}" /></td>
</tr>

<tr>
	<td>银行密码</td>
	<td><input type="text" name="cardPassward" value="${userListCustom.cardPassward}" /></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>