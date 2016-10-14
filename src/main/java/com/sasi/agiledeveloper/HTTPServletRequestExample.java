package com.sasi.agiledeveloper;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTTPServletRequestExample
 */
public class HTTPServletRequestExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String textboxValue = request.getParameter("textbox");
		String[] multiple = request.getParameterValues("select");
		String print="";
		for(String m : multiple){
			print+=" "+m;
		}
		
		Enumeration<String>  headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String key = headerNames.nextElement();
			pw.println(key + " : "+ request.getHeader(key));
		}
		pw.append("Served at: ").append(request.getContextPath()).append(" "+textboxValue+" "+print);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
