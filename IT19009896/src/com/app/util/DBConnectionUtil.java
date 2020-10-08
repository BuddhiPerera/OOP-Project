/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;
import java.sql.Connection;

public class DBConnectionUtil extends CommonUtil {
	// create database connection
	public static Connection getConnection()throws ClassNotFoundException, SQLException, IOException{
		String driver = property.getProperty(CommonConstants.DRIVER_NAME);
		String url = property.getProperty(CommonConstants.URL);
		String username = property.getProperty(CommonConstants.USERNAME);
		String password = property.getProperty(CommonConstants.PASSWORD);
	
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	// close database connection
	public static void closeConnection(Connection con){
		con = null;
	}
}