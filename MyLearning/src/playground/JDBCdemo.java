package playground;

import java.sql.DriverManager;
import java.sql.*;

class JDBCdemo {
    public static void main(String[] args) throws Exception {
		String url ="jdbc:mysql://localhost:3306/myfirstdb";
		String uname="root";
		String pass="root";
		String query="insert into student values(?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, 6);
		st.setString(2, "Krishna");
		Integer count = st.executeUpdate();
		
		System.out.println("Rows affected : "+count);

		st.close();
		con.close();
    }
}