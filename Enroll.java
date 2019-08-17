package com.servlet;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author Plus
 * @date 2019年7月18日
 */
@WebServlet("/Enroll")
public class Enroll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Enroll() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p=request.getParameter("password");
		
		if(p.equals("123")){
			
				request.getRequestDispatcher("Welcome.jsp").forward(request, response);
				
						
	}
		else{
		 PrintWriter out=response.getWriter();

			out.print("<script>alert('username or password is error');window.location.href='Enroll.html'</script>");

			System.out.println("密码错误！");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
