<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户列表</title>
<script type="text/javascript">
	/* function deleteuserList(userName) {
		//提交form
		document.userListForm.action = "${pageContext.request.contextPath}/userList/deleteuserList.action?userName="+userName;
		document.userListForm.submit();
	}
	function queryuserList() {
		//提交form
		document.userListForm.action = "${pageContext.request.contextPath }/userList/queryUser.action";
		document.userListForm.submit();
	} */
	function insertuserList() {
		//提交form
		document.userListForm.action = "${pageContext.request.contextPath }/userList/insertuserList.action";
		document.userListForm.submit();
	} 
	function queryuserList() {
		//提交form
		document.userListForm.action = "${pageContext.request.contextPath }/userList/queryUser.action";
		document.userListForm.submit();
	}
</script>
</head>
<body>
	当前用户：${userName },
<c:if test="${userName!=null }">
 <a href="${pageContext.request.contextPath }/logout.action">退出</a>
</c:if>
	<form name="userListForm" action="${pageContext.request.contextPath }/userList/queryUser.action" method="post">
		查询条件：
		<table width="100%" border=1>

			<tr>
				<td>登陆名：<input name="userListCustom.userName" />
				</td>
				<td><input type="button" value="查询" onclick="queryuserList()"/></td>
				<td><input type="button" value="添加" onclick="insertuserList()" /></td>
			</tr>

		</table>
		用户列表：
		<table width="100%" border=1>
			<tr>
				<td>登录名</td>
				<td>登录密码</td>
				<td>姓名</td>
				<td>用户交易量</td>
				<td>银行卡号</td>
				<td>银行密码</td>
				<td>操作1</td>
				<td>操作2</td>
			</tr>
			<!--UserController里面的userList-->
			<c:forEach items="${userList }" var="userList">
				<tr>
					<td>${userList.userName}</td>
					<td>${userList.password}</td>
					<td>${userList.name}</td>
					<td>${userList.userVolume}</td>
					<td>${userList.cardNum}</td>
					<td>${userList.cardPassward}</td>

					<td><a
						href="${pageContext.request.contextPath }/userList/editUserList.action?userName=${userList.userName}">修改</a></td>

					<td><a
						href="${pageContext.request.contextPath }/userList/deleteuserList.action?userName=${userList.userName}">删除</a></td>
				</tr>
			</c:forEach>

		</table>
	</form>

</body>
</html>