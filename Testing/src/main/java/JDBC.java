import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBC {

	public static void main(String[]args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/lidl", "root", "password");
		Statement stmt = conn.createStatement();
		String sql = "select * from stores";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next() == true) {
			System.out.println(rs.getString("name"));
		}
		conn.close();
		
//		stmt.execute(sql);
	}
}
