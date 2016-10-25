package com.sasi.agiledeveloper.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletSecurityElement;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Context
 *
 */
@WebListener
public class Context implements ServletContextListener {
	private static ServletContext CONTEXT = null;

    /**
     * Default constructor. 
     */
    public Context() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println(CONTEXT.getAttribute("app-global-key"));
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	CONTEXT = sce.getServletContext();
    	CONTEXT.setAttribute("app-global-key", "app-global-value");
    	CONTEXT.setAttribute("country", new String[]{"India","Srilanka","Bangladesh","Singapore"});
    	System.out.println("In Servlet Context Listener");
    	
    }
	
}


