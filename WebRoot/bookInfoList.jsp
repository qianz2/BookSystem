<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书信息</title>
<script type="text/javascript">
	function page_nav(frm, num) {
		frm.page.value = num;
		frm.submit();
	}

	function jump_to(frm, pageno) {
		var regexp = /^\d+$/;
		if (!regexp.test(pageno)) {
			alert("请输入 正确的数字！");
			return false;
		} else {
			page_nav(frm, pageno);
		}
	}

	function jump_new() {
		jump_to(document.forms[1], document.getElementById('choose').value);

	}
	function out() {
		var result = confirm("是否退出系统?");
		if (result == true) {
			window.location.href = "login.jsp";
		}
	}
</script>
</head>
<body>
	<h1 align="center">图书借阅系统</h1>
	<p align="center">
		<%
			Object o = session.getAttribute("userCode");
			if (o == null) {
			} else {
				out.print("当前用户:" + o.toString());
			}
		%>
		<a href="#" onclick="out()">退出</a>
	</p>
	<div class="menu" align="center">

		<table>
			<tbody>
				<tr>
					<td>
						<form method="post" action="bookInfo_likeType">
							<input name="flag" value="search" class="input-text"
								type="hidden"> 图书分类：<select name="name">
								<option value="">-请选择-</option>
								<c:forEach items="${ typeList}" var="type">
									<option value="${type.id}">${type.typeName}</option>
								</c:forEach>
							</select>&nbsp;&nbsp;&nbsp;&nbsp; 图书名称：<input name="likename"
								class="input-text" type="text" value="">&nbsp;&nbsp;&nbsp;&nbsp;
							是否借阅：<select name="isborrow">
								<option>-请选择-</option>
								<option>已借阅</option>
								<option>未借阅</option>
							</select> <input value="查 询" type="submit">
						</form>
					</td>
				</tr>
			</tbody>
		</table>

	</div>
	<div class="main" align="center">
		<input type="hidden" value="1" name="page" />
		<table align="center" border="1">
			<tr style="background: green;">
				<td>图书编号</td>
				<td>图书分类</td>
				<td>图书名称</td>
				<td>作者</td>
				<td>出版社</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${pages.list}" var="s" varStatus="varStatus">
				<tr
					<c:if test="${varStatus.count%2==0}">style="background:gray;"</c:if>>
					<td><c:out value="${s.bookCode}"></c:out></td>
					<td><c:out value="${s.bookType.typeName}"></c:out></td>
					<td><c:out value="${s.bookName}"></c:out></td>
					<td><c:out value="${s.bookAuthor}"></c:out></td>
					<td><c:out value="${s.publishPress}"></c:out></td>
					<c:if test="${s.isBorrow==1 }">
						<td><c:out value="已借阅"></c:out></td>
					</c:if>
					<c:if test="${s.isBorrow==0 }">
						<td><a href="bookInfo_update"><c:out value="申请借阅"></c:out></a></td>
					</c:if>
				</tr>
				<br>
			</c:forEach>
		</table>
		<form action="bookInfo_list" method="post">
			<input type="hidden" value="1" name="page" />
			<table>
				<tr>
					<c:if test="${pages.currentPage!=1 }">
						<td><a href="bookInfo_list?page=${pages.first }">首页</a></td>
						<td><a href="bookInfo_list?page=${pages.previous }">上一页</a></td>
					</c:if>
					<td>第${pages.currentPage} 页/共${pages.totalPage}页</td>
					<c:if test="${pages.currentPage!=pages.totalPage }">
						<td><a href="bookInfo_list?page=${pages.next }">下一页</a></td>
						<td><a href="bookInfo_list?page=${pages.last }">尾页</a></td>
					</c:if>
					<td></td>
					<td>到第<input type="text" id="choose" size="3" />页<input
						type="submit" value="确定" onclick="jump_new()" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>