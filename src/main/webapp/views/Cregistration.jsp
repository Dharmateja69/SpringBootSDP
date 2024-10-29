<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
</head>
<body>
<%@include file="mainnavbar.jsp" %>
<h3 align="center">Customer Registration Form</h3>
<form method="post" action="insertcustomer">
<div name="container">
<label>Enter Name:</label>
<input type="text" name="cname"  required/>
<br/>
<label>Enter Gender:</label>
<input type="radio" name="cgender" class="form-check-input" value="MALE" required/>MALE
<input type="radio" name="cgender" class="form-check-input" value="FEMALE"  required/>FEMALE
<input type="radio" name="cgender" class="form-check-input" value="Others" required/>Others
<br/>
<label>Select date of Birth:</label>
<input type="date" name="cdob" required/>
<br/>
<label>Enter Email id:</label>
<input type="email" name="cemail" class="form-control" required/>
<br/>
<label>Enter Password:</label>
<input type="password" name="cpwd" class="form-control" required/>
<br/>
<label>Enter Location:</label>
<input type="text" name="cloc" class="form-control" required/>
<br/>
<label>Enter Contact Number:</label>
<input type="text" name="ccn" class="form-control" required/>
<br/>
<input type="submit" class="btn btn-success"  value="register"/>
<input type="reset" class="btn btn-success" value="Clear"/>

</div>

</form>
</body>
</html>