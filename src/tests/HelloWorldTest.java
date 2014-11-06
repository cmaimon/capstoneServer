package tests;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Before;
import org.junit.Test;

import static jooq.generated.Tables.*;

import code.DBConn;
import code.HelloWorld;

public class HelloWorldTest {
	public HelloWorld hw;
	public Connection conn;

	@Before
	public void setUp() {
		hw = new HelloWorld();
		DBConn mockedConn = mock(DBConn.class);
		hw.dbConn = mockedConn;
		conn = this.createKevinDBConnection();
		when(mockedConn.getConnection()).thenReturn(conn);
		this.configureUsers();
	}
	
	public void configureUsers() {
		DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
		create.deleteQuery(USERS).execute();
		create.insertInto(USERS, USERS.USERNAME, USERS.PASSWORD).values("kevin", "kevin").execute();
	}

	@Test
	public void testIsAuthenticated() {
		boolean isAuthenticated = hw.authenticate("kevin", "kevin");
		assertTrue(isAuthenticated);
	}

	@Test
	public void testExampleQuery() {
		boolean result = hw.exampleQuery();
		assertTrue(result);
	}

	public Connection createKevinDBConnection() {
		Connection conn = null;

		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/cs4720cem6at";

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
