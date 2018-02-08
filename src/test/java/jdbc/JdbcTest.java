package jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class JdbcTest {

	@Test
	public void test() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://10.202.185.123:3306/tms?rewriteBatchedStatements=TRUE&amp;cachePrepStmts=TRUE&amp;useServerPrepStmts=TRUE&amp;useUnicode=TRUE&amp;characterEncoding=UTF8&amp;autoReconnect=TRUE&amp;failOverReadOnly=FALSE",
				"usr_tms", "Hb5y8D3p7");
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery("select count(*) from o_order_3pl");
		while (result.next()) {
			System.out.println(result.getInt(2));
		}
	}

}
