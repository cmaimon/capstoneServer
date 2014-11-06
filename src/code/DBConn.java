package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton to get Connection for making database queries.
 * 
 * Remember to close the connection once you're done!
 * @return
 * Returns Connection. null if unsuccessful.
 */
public class DBConn {
	private static DBConn _instance = new DBConn();

	private Connection conn;

	protected DBConn() {
		this.conn = createConnection();
	}
	
	public static DBConn getInstance() {
		if (DBConn._instance == null) {
			DBConn._instance = new DBConn();
		}
		return DBConn._instance;
	}
	
	public Connection getConnection() {
		return conn;
	}

	private Connection createConnection() {
		Connection conn = null;

		String userName = "cs4720cem6at";
		String password = "kevinandcourtney";
		String url = "jdbc:mysql://stardock.cs.virginia.edu/cs4720cem6at";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.close();
			} catch (SQLException ignore) {

			}
			return null;
		}
	}
}
