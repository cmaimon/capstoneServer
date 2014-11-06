package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import code.HelloWorld;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import code.DBConn;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	public HelloWorld hw;

	@Before
	public void setUp() {
		hw = new HelloWorld();
		DBConn mockedConn = mock(DBConn.class);
		hw.dbConn = mockedConn;
		Connection conn = this.createKevinDBConnection();
		when(mockedConn.getConnection()).thenReturn(conn);
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
