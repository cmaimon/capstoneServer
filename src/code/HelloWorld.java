package code;

import static jooq.generated.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;


public class HelloWorld {
	
	/**
	 * Class to get Connection for making database queries.
	 * 
	 * Remember to close the connection once you're done!
	 * @return
	 * Returns Connection. null if unsuccessful.
	 */
	public static Connection getConnection() {
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
	
	public boolean exampleQuery() {
		Connection conn = getConnection();
		if (conn == null) {
			return false;
		}
		DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
		Result<Record> result = create.select().from(USERS).fetch();
		String retVal = "";
		for (Record r : result) {
			String username = r.getValue(USERS.USERNAME);
			Integer gold = r.getValue(USERS.GOLD);
			retVal += "USER: " + username + ", gold: " + gold + "\n";
		}
		if (retVal.equals("")) {
			System.out.println(retVal);
			return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		
		
	}
	
	public String sayHello(String name) {
        return "Hello, " + name;
    }
}
