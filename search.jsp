<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coffeeshop Locator</title>
</head>
<body  background="https://c.o0bg.com/rf/image_960w/Boston/2011-2020/2015/11/10/BostonGlobe.com/Business/Images/a37f0352-34ea-4598-8201-f3e9eb38a96d-5129.jpg">
<center><p><h1 align="center" >Coffeeshop Locater</h1></p>
<form action="Search" method="post">
		<select name="select">
		<option value="Type">select</option>
		<option value="Location" name="Location ">Location</option>
		<option value="City" name="City ">City</option>
		<option value="Zip" name="Zip ">Zip</option>
		</select>
		<input type="text" name="val" value="Query" >
		<input type="submit" value="Search" />
		 </form>
		<%
String vals=request.getParameter("val");

if(vals!=null && vals!=""){
%>
		<table border='1' align="center" ">
     
       <tr>
           
           <th>Store id</th>
           <th>Name</th>
           <th>Phone number</th>
           <th>Street 1</th>
           <th>City</th>
           <th>State</th>
           <th>Zip</th>
           <th>Country</th>
           <th>Cordinates</th>
       </tr>
       
       <c:forEach items="${Shop}" var="Shop">
	     <tr>
	     	  	
	     	<td>${ Shop.store_id }</td>
	     	<td>${ Shop.name }</td>
	     	<td>${ Shop.phon_num}</td>
	     	<td>${ Shop.street_1}</td>
	     	<td>${ Shop.city}</td>
	     	<td>${ Shop.state}</td>
	     	<td>${ Shop.zip}</td>
	     	<td>${ Shop.country}</td>
	     	<td>${ Shop.coordinates}</td>
	     </tr>
	</c:forEach>
  
  
     </table>
     <%} %>
    </center>
</body>
</html>