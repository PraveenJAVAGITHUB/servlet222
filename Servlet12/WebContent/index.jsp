<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function f1() 
{
	var name=document.myform.name.value;
	var password=document.myform.pass.value;
	if(name==""||password==""||name==null||password==null)
		{
		alert("all fields are mandatory")
		return false;
		}
	else if(password.length<5)
		{
		alert("password should be more than 5 char");
		return false;
		}
	return true;
	
}
</script>
</head>
<body>
<form action="./servletpracting" name="myform" method="post" onsubmit="return f1()">
Name:<input type="text" name="name" maxlength="40"/><br>
Password:<input type="password" name="pass"/><br>
<input type="submit" value="login"/>
</form>
</body>
</html>