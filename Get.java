package com.servlet;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/Get")
public class Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Get() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   		request.setCharacterEncoding("utf-8");
				  String Book=request.getParameter("Book");
				  String Author=request.getParameter("Author");
				  String Date=request.getParameter("Date");
				  String Note=request.getParameter("Note");
				  String Type=request.getParameter("Type");
				  BookList booklist=new BookList(Book,Author,Date,Note,Type);
				  BookListDao booklistdao = new BookListDao();
				  int result= booklistdao.addBook(booklist);
				  request.getRequestDispatcher("/BookListServlet").forward(request, response);
			}
	
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
