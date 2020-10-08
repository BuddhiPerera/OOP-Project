/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryUtil extends CommonUtil {
	private static Connection con; 
	
	// execute insert, update, delete queries
	public static void IUDRunner(String sql) throws ClassNotFoundException, SQLException, IOException {
		if(con == null || con.isClosed()) {
			con = DBConnectionUtil.getConnection();
		}
		Statement statement = con.createStatement();
		statement.executeUpdate(sql);
		DBConnectionUtil.closeConnection(con);
	}
}
