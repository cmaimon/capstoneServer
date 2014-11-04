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
	public static void main (String[] args) {
		Connection conn = null;
		
		String userName = "cs4720cem6at";
		String password = "kevinandcourtney";
		String url = "jdbc:mysql://stardock.cs.virginia.edu/cs4720cem6at";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(USERS).fetch();
			
			for (Record r : result) {
				String username = r.getValue(USERS.USERNAME);
				Integer gold = r.getValue(USERS.GOLD);
				System.out.println("USER: " + username + ", gold: " + gold );
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
					
				}
			}
		}
		
	}
	
	public String sayHello(String name) {
        return "Hello, " + name;
    }
}
