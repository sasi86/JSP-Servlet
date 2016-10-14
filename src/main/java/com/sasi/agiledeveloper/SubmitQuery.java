package com.sasi.agiledeveloper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubmitQuery
 */
@WebServlet(urlPatterns="/SubmitQuery")
public class SubmitQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession(true);
//		//session.setAttribute("a", "a");
//		request.setAttribute("b", "b");
//		  RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
//	        rd.forward(request, response);
//		
		//response.sendRedirect("index.jsp");
	/*	response.setContentType("text/plain");
		PrintWriter write  = response.getWriter();
		write.write("abc");
		*/
		Map<String, String> listBoxValues = new HashMap<String, String>();
		listBoxValues.put("books", "Java8 In Action,Spring In Action");
		String query  = request.getParameter("query").toString();
		
	    response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
	    response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
	    response.getWriter().write(listBoxValues.get(query.toLowerCase()));    
	    
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
