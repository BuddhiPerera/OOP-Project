/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.util;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class PaymentUtil {
	
	public static boolean insertPayment(String amount, String customerid, String reservid) {
		
		boolean isSuccess = false;
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/oopwebapp";
		String user = "root";
		String password = "coduza";
		try {
			
			float payAmount = Float.parseFloat(amount==null?"0":amount);
			int cusID = Integer.parseInt(customerid==null?"0":customerid);
			int resID = Integer.parseInt(reservid==null?"0":reservid);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DBConnectionUtil.getConnection();
			Statement statement = con.createStatement();
			// insert query
			String sql = "insert into payment values(0,'"+payAmount+"',NOW(),'"+cusID+"','"+resID+"')";
			int pass = statement.executeUpdate(sql);
			
			if(pass > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
}
