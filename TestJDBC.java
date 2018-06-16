package Review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	
	public class TestJDBC {
	
				public static void main(String[] args) {
		   String url ="jdbc:mysql://127.0.0.1/?serverTimezone=UTC&verifyServerCertificate=false&useSSL=true&user=root&password=hyeok0710";
		   Connection conn=null;
		   Statement stmt=null;
		   ResultSet rs=null;
		   try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      System.out.println("드라이버 연결성공");
		      
		      conn = DriverManager.getConnection(url);
		      System.out.println("데이터베이스 연동성공");
		      
		      stmt =conn.createStatement();
		      String themenu = "use themenu";
		      stmt.executeUpdate(themenu);
		      
		      }
		   catch(ClassNotFoundException cnfe) {
		      cnfe.printStackTrace();
		   }
		   catch(SQLException se) {
		      se.printStackTrace();
		   }
		   finally {
		      if(conn!=null) try {conn.close();} catch(SQLException se) {}
		      if(stmt!=null) try {stmt.close();} catch(SQLException se) {}
		      if(rs!=null) try {rs.close();} catch(SQLException se) {}
		   }
		}
		}
