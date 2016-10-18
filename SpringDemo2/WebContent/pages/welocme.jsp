<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Test</title>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" type="image/png" href="resources/images/icon.jpg">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="resources/css/index.css">
  
<title>Insert title here</title>
<style>
body {
    background-color: lightblue;
}
</style> 
</head>
<body>
<div class="container">
<div id="header"></div>
<h1 align="center">
Online Book Shop
</h1>
<h3><marquee class="marque"></marquee></h3>
	<ul>
	 <li><a href="#">Welcome   ${email}</a></li>
	 <h1><u><a href="blankpage.jsp" target="main">Home</a></u></h1>
	<%-- <div>
	
		<div id = "middle" style = "float:left; width: 50%;" ><li><a href="#">Welcome   ${email}</a></li></div>
		
       
    </div> --%>
        
        <div id = "container" style = "width:100%">
        
   <!--    <div id = "middle" style = "float:left; width: 50%;"><a href="blankpage.jsp" target="main" >Home</a></div> -->
     <!--  <div id = "right" style = "float:left; width: 25%;"><a href="index.jsp" align="right">Logout</a></u></div> -->
        </div>
       <div>
       
       </div>
		<!-- <h1><u><a href="blankpage.jsp" target="main" >Home</a>
		 <a href="index.jsp" align="right">Logout</a></u>
		</h1> -->
        <div class="divsion">
            <ul class="horizontalmenu>">
          <!--   <image src="resources/images/WinTheRace.jpg"/> -->
    <table style="width:100%" border=10px>
    <tr>
    <th>BookImage</th>
    <th>BookName</th>
    <th>Author</th> 
    <th>Categories</th>
    <th>Price</th>
    <th>Quantity</th>
    <th></th>
  </tr>
  <tr></tr>
   <c:forEach var="book" items="${books}">
  <tr>
  	<th><img src="resources/images/${book.bookimage}"/></th>
    <th>${book.bookname}</th>
    <th>${book.author}</th> 
    <th>${book.category}</th>
    <th>${book.price}</th>
    <th>${book.quantity}</th>
    <th><button>Buy Now</button></th>
  </tr>
  </c:forEach>
</table>
            </ul>
            <li><a href="index.jsp">Logout</a></li>
        
      </ul>
     </div>
</div>
</body>
</html>