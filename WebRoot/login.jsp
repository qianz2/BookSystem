<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<style type="text/css">
.red{
	color:#F00;
}
.black{
	color:#0F0;
}
</style>
<script type="text/javascript">
function toRegister(){
	window.location.href="register.jsp";
}
function $(id){
	return document.getElementById(id);
}
function checkUser(){
	var user = $("user").value;
	var user_prompt = $("user_prompt");
	user_prompt.innerHTML="";
	var reg=/^\w{1,25}$/;//只能写1到25个字母或者数字
	if(reg.test(user)==false){
		user_prompt.innerHTML="用户填写不规范";
		user_prompt.className="red";
		return false;
	}
	user_prompt.className="black";
	return true;
}
function checkKey(){
	var key = $("key").value;
	var key_prompt = $("key_prompt");
	key_prompt.innerHTML="";
	var reg=/^\w{6,25}$/;//密码只能写6到25个数字或字母
	if(reg.test(key)==false){
		key_prompt.innerHTML="密码填写不规范";
		key_prompt.className="red";
		return false;
	}
	key_prompt.className="black";
	return true;
}
</script>
</head>
<body>
<div align="center">
<h1>图书借阅系统</h1>
<form action="user_login" method="post">
<input type="hidden" id="id" name="id" value="${users.userId}"><br>
登录账号:<input type="text" id="user" name="userCode" value="${users.userCode}" onblur="checkUser()"><span id="user_prompt"></span><br><br>
登录密码:<input type="password" id="key" name="password" value="${users.password}" onblur="checkKey()"><span id="key_prompt"></span><br><br>
<input type="submit" value="登录|Login"><input type="button" value="注册用户" onclick="toRegister()">
</form>
</div>
</body>
</html>