<%@page import="com.Data.BookList"%>
<%@ page language="java" import="java.util.*,com.Data.BookList" pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'showbook.jsp' starting page</title>
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
     a{text-decoration: none;}
    td{
    /*display:block;*/
    width:120px;
    height:20px;
    }
    tr{
     width:1200px;
    }
    body{
    background-image:url("1.jpg")
    background-attachment:"fix"}
    </style>
  </head>
  
  <body>
   <%
Object obj =request.getAttribute("booklist");
/* Object obj1 =request.getAttribute("sum"); */
List<BookList> list=(List<BookList>)obj;
%>
<center><h1>书单</h1>
<table width=800 border="1">
	<tr>
		<td>编号</td>
		<td>名称</td>
		<td>作者</td>
		<td>日期</td>
		<td>类型</td>
		<td>备注</td>
		<td>操作</td>
		
	</tr>
<%
for(int i = 0;i<list.size();i++){
	BookList p=list.get(i);
%>
	<tr>
		<td><%=p.getNo() %> </td>
		<td><%=p.getBook() %></td>
		<td><%=p.getAuthor() %></td>
		<td><%=p.getDate() %></td>
		<td><%=p.getType() %></td>
		<td><%=p.getNote() %></td>
		<td>
			<div id="login_click">
       				 <a id="btlogin" href="Delete?tid=<%=p.getNo()%>" onclick="return confirm('确认删除？')">删除</a>
       		</div>
       		<div id="login_click">
       				 <a id="btlogin" href="Alter.jsp?tid=<%=p.getNo()%>">修改</a> 
       		 </div>
		</td>
	</tr>
<%} %>




</table></center>
  </body>
</html>