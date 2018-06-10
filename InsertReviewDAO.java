package Review;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;



public class InsertReviewDAO {

	public static boolean create(ReviewDTO dto) throws Exception {

		 

		   boolean flag = false;
		   Connection con = null;
		   Statement stmt = null; // 데이터를 전송하는 객체

		   String sex = dto.getSex();
		   String comment = dto.getCommnet();
		

		   String sql = "INSERT INTO review(sex, comment) VALUES";

		   try {

			   sql += "('" + new String(sex.getBytes(), "ISO-8859-1") + "','"
					      + new String(comment.getBytes(), "ISO-8859-1") + "','";
					      
			   
		    Class.forName("com.mysql.jdbc.Driver");

		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/themenu", "root", "hyeok0710");
		    stmt = (Statement) con.createStatement();
		    stmt.executeUpdate(sql);
		 
		    flag = true;

		   } catch (Exception e) {

		    System.out.println(e);

		    flag = false;

		   } finally {

		
		    try {

		     if (stmt != null)

		      stmt.close();

		     if (con != null)

		      con.close();

		    } catch (Exception e) {

		     System.out.println(e.getMessage());

		    }

		   }	 
		   return flag;
		  }

	
}
