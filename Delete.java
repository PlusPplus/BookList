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
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Delete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String N=request.getParameter("tid"); 
		int No=Integer.parseInt(N);	
		BookListDao booklistdao=new BookListDao();
		int result= booklistdao.delBook(No);
		System.out.println(result);
		
		request.getRequestDispatcher("/BookListServlet").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
