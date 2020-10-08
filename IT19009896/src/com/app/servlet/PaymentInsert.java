/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.servlet;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.util.PaymentUtil;

/**
 * Servlet implementation class PaymentInsert
 */
@WebServlet("/PaymentInsert")
public class PaymentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/payment.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String amount = request.getParameter("price");
		String customerid = request.getParameter("customerId");
		String reservid = request.getParameter("reservID");
		
		boolean isTrue;
		
		isTrue = PaymentUtil.insertPayment(amount,customerid,reservid);
		
		if(isTrue == true) {
			RequestDispatcher dispatch = request.getRequestDispatcher("/successPayment.jsp");
			dispatch.forward(request, response);
		}
		else {
			RequestDispatcher dispatch = request.getRequestDispatcher("/unsuccessPayment.jsp");
			dispatch.forward(request, response);
		}
	}
}
