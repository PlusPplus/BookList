package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Data.BookList;
import com.Data.BookListDao;
/**
 * @author Plus
 * @date 2019年7月18日
 */

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Update() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		  String N=request.getParameter("No"); 
		  int No=Integer.parseInt(N);	
		  String Book=request.getParameter("Book");
		  String Author=request.getParameter("Author");
		  String Date=request.getParameter("Date");
		  String Note=request.getParameter("Note");
		  String Type=request.getParameter("Type");
		  BookList booklist=new BookList();
		  
		  booklist.setNo(No);
		  booklist.setBook(Book);
		  booklist.setAuthor(Author);
		  booklist.setDate(Date);
		  booklist.setNote(Note);
		  booklist.setType(Type);
		  BookListDao booklistdao = new BookListDao();
		  booklistdao.updatebook(booklist);
		  
		  request.getRequestDispatcher("/BookListServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
