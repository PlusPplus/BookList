<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>欢迎进入您的个人书库</title>
    <link href="Style.css" type="text/css" rel="stylesheet"/>
</head>
<meta name="viewport" content="width=device-width,initial-scale=1.0">

<body ><center>
 <style type="text/css">
 
 #login_click{ margin-top:32px; height:40px;}
#login_click a 
{
    
 
    text-decoration:none;
	background:#2f435e;
	color:#f2f2f2;
	
	padding: 10px 30px 10px 30px;
	font-size:16px;
	font-family: 微软雅黑,宋体,Arial,Helvetica,Verdana,sans-serif;
	font-weight:bold;
	border-radius:3px;
	
	-webkit-transition:all linear 0.30s;
	-moz-transition:all linear 0.30s;
	transition:all linear 0.30s;
	
	}
   #login_click a:hover { background:#385f9e; }
   
   
 a{text-decoration: none;
 }
    body{
    background-image:url("1.jpg")}
    </style>
    <div class = "main">
	    <div class = "top" border = "1px">
	    	<h1>书中自有颜如玉     书中自有黄金屋</h1>
	    </div>
	    <div class = "content">
	    	<div class = "left">
	    	       	<div id="login_click">
        <a id="btlogin" href="BookListServlet"target = "right">我的书单</a>
       				 </div>
	    			<div id="login_click">
        <a id="btlogin" href="Add.html"target = "right">新增书籍</a>
       				 </div>
	    	<div id="login_click">
        <a id="btlogin" href="Search.html"target = "right">搜索书籍</a>
       				 </div>

	    	<!-- <a href="Add.html" target = "right">新增书籍</a><br>
		<a href="Search.html" target = "right">搜索书籍</a><br>
		<a href="BookListServlet" target = "right">我的书单</a> -->
	    	</div>
	    	<div class = "right">
	    		
	    		<iframe width="100%" height="100%" name = "right" src="GHg.jpg" width=72%></iframe>
	    	</div>
	    </div>
	   </div>
	<!-- <h1>书中自有颜如玉</h1><h1>书中自有黄金屋</h1>
	<img src="GHg.jpg" width=20%>
	<ul>
	<a href="Add.html">新增书籍</a>
	<a href="Search.html">搜索书籍</a>
	<a href="BookListServlet">我的书单</a> -->

	</ul>
	
	</center>
	<div class="text"><p>版权所有 ©xiaoquanbin  私人书单系统 </p></div>
</body>
</html>