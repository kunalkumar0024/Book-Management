<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.main{ width:100%; height:150px; background:white; padding-top:60px;}
.heading{ color:lightskyblue; font-size: 30px; text-align: center; font-weight: 900;}
.section{ width:100%; height: 400px; background: lightgray;}
.foooter{ width: 100%; height:200px; background:rgba(0,0,20,0.8);}
.formStyle{width:300px; height:400px;background:white; margin-left:40%;padding-left:90px; color:green; font-size:20px; border-radius:30px; box-shadow:2px 2px 5px lightblue;}
.btn{ background:green; color:white;margin-left:45px;}
</style>
</head>
<body>
<div class="main">
<h1 class="heading">GeekyBlogger</h1>
</div>
<div class="section">
<div class="formStyle">
<form><br><br><br><br>
Name:<br> <input type="text" name="name" placeholder="Enter your name" required="required"/><br><br><br>
Email:<br> <input type="email" name="email" placeholder="Enter your Email Id" required="required"/><br><br><br>
<input class="btn" type="submit" name="submit" value="SUBMIT"/>
</form>
</div>
 </div>

<div class="foooter"> </div>
</body>
</html>