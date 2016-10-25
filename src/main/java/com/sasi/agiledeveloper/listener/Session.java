package com.sasi.agiledeveloper.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Session
 *
 */
@WebListener
public class Session implements HttpSessionListener {
	public static Session SESSION = null; 
    /**
     * Default constructor. 
     */
    public Session() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("In Session Listener - Session Created");
    	
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("In Session destroyed - Session Destroyed");
    }
	
}
