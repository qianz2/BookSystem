<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<style type="text/css">
.red{
	color:#F00;
}
.black{
	color:#0F0;
}
</style>
<script type="text/javascript">
function goback(){
	history.go(-1);
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
function checkRepeat(){
	var key = $("key").value;
	var repeat = $("repeat").value;
	var repeat_prompt = $("repeat_prompt");
	repeat_prompt.innerHTML="";
	if(key!=repeat){
		repeat_prompt.innerHTML="密码与之前不符";
		repeat_prompt.className="red";
		return false;
	}
	repeat_prompt.className="black";
	return true;
}
function checkEmail(){
	var email = $("email").value;
	var email_prompt = $("email_prompt");
	email_prompt.innerHTML="";
	var reg=/^\w+@\w+(\.[a-zA-Z]{2,3})+$/;
	if(reg.test(email)==false){
		email_prompt.innerHTML="Email格式不正确，例如web@souhu.com";
		email_prompt.className="red";
		return false;
	}
	email_prompt.className="black";
	return true;
}
</script>
</head>
<body>
<div align="center">
<form action="user_add" method="post">
<table>
<tr><td><h2>会员注册</h2></td></tr><br>
<tr><td>登陆账号:<input id="user" type="text" name="users.userCode" value="" onblur="checkUser()"/><span id="user_prompt"></span></td></tr><br>
<tr><td>密&nbsp;&nbsp;&nbsp;&nbsp;码:<input id="key" type="password" name="users.password" value="" onblur="checkKey()"/><span id="key_prompt"></span></td></tr><br>
<tr><td>确认密码:<input id="repeat" type="password" name="users.repassword" value="" onblur="checkRepeat()"/><span id="repeat_prompt"></span></td></tr><br>
<tr><td>性&nbsp;&nbsp;&nbsp;&nbsp;别:<select name="users.gender" style="width:100px"><option>男</option><option>女</option></select></td></tr><br>
<tr><td>电子邮箱:<input id="email" type="text" name="users.email" value="" onblur="checkEmail()"/><span id="email_prompt"></span></td></tr><br>
</table>
<table>
<tr>
<td><input type="submit" value="注册"/></td>
<td><input type="button" value="返回" onclick="goback()"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>