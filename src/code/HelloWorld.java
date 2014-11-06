package code;

import static jooq.generated.Tables.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;


public class HelloWorld {
	
	public DBConn dbConn = DBConn.getInstance();
	
	public boolean exampleQuery() {
		Connection conn = dbConn.getConnection();
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
	
	/**
	 * Returns true if the username exists and has the correct password.
	 * Returns false otherwise, including if there is no connnection.
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean authenticate(String username, String password) {
		Connection conn = dbConn.getConnection();
		if (conn == null) {
			return false;
		}
		DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
		Result<Record> result = create
				.select()
				.from(USERS)
				.where(USERS.USERNAME.equal(username))
					.and(USERS.PASSWORD.equal(password))
				.fetch();
		if (result.size() >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.exampleQuery());
		System.out.println(hw.authenticate("kmw8sf", "kevin"));
	}
	
	public String sayHello(String name) {
        return "Hello, " + name;
    }
}
