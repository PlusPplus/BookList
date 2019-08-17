<%@ page language="java" import="java.util.*,com.Data.BookListDao,com.Data.BookList" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>更改页面</title>

  </head>
  
  <body >
  <style type="text/css">
    body{
    background-image:url("1.jpg")}
    </style>
  <h1>添加信息</h1>
  <form action="Update" method="post">
   <%
   	String N=request.getParameter("tid"); 
	int No=Integer.parseInt(N);	
	BookListDao booklistdao=new BookListDao();
	BookList b=booklistdao.querybyno(No);
	
    %>
<input type="hidden" name="No" value="<%=No%>"><br>
书籍名称：<input type="Book" name="Book" value="<%=b.getBook()%>"><br>
书籍作者：<input type="Author" name="Author" value="<%=b.getAuthor()%>"><br>
阅读时间：<input type="Date" name="Date" value="<%=b.getDate()%>"><br>
书籍类型：<select name="Type" value="<%=b.getType()%>">
		<option value="心理">心理</option>
		<option value="社科">社科</option>
		<option value="人物传记">人物传记</option>
		<option value="散文随笔">散文随笔</option>
		<option value="国内小说">国内小说</option>
		<option value="国外小说">国外小说</option>
		<option value="星标">星标</option>
	 </select><br>
阅读笔记：<input cols="100" rows="10" name="Note" value="<%=b.getNote()%>"><br>
	  <input type="submit" value="提交">
	  
    
    
  </body>
</html>
