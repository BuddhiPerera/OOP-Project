package com.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class paymentServlet
 */
@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/index.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerID = Integer.parseInt(request.getParameter("customerID"));
		String serviceType = request.getParameter("serviceType");
		double price = Double.parseDouble(request.getParameter("price"));
		int reservID = Integer.parseInt(request.getParameter("reservID"));
		
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/payment.jsp");
		request.setAttribute("customerID", customerID);
		request.setAttribute("serviceType", serviceType);
		request.setAttribute("price", price);
		request.setAttribute("reservID", reservID);
		dispatch.forward(request, response);
	}

}
