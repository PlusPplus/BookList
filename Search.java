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

@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Search() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("Date1");
		String b=request.getParameter("Date2");
		BookListDao booklistdao = new BookListDao();
		List<BookList> list=booklistdao.queryDate(a,b);
		request.setAttribute("List<BookList>",list);
		request.getRequestDispatcher("FeedBack.jsp").forward(request,response);}
			
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
