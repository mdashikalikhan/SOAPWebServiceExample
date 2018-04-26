package DC.services.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;




public class ConnectionManager {
	private static DataSource ds = null;
	private static Context ctx = null;
	private static Connection conn = null;
	
	public static Connection openConnection() throws Exception {
		try {
			if (ds == null) {
				if (ctx == null) {
					ctx = new InitialContext();
					// ds = (DataSource)
					// ctx.lookup("java:comp/env/java/OracleDS");
					// ds = (DataSource) ctx.lookup("java:java/OracleDS");
					ds = (DataSource) ctx.lookup("java/OracleDS");
				}
			}
			Connection con=ds.getConnection();
			return con;
		} catch (Exception e) {
			throw e;
		}
	}
	public static Connection getConnection(String dbUser, String dbPwd, String dbURL) {
			try {
				if(conn==null || conn.isClosed()) {
					
						conn = DriverManager.getConnection(dbURL, dbUser, dbPwd);
					
				}
			} catch (SQLException e) {
				conn=null;
				e.printStackTrace();
			}
		return conn;
	}
}
