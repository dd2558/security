package file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileDAO {
	
	private Connection conn;
	
	public FileDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/file";
			String dbID = "dd2558";
			String dbPassword = "gkehddnjs10";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int upload(String fileName, String fileRealName) {
		String SQL = "insert into file values(?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, fileName);
			pstmt.setString(2, fileRealName);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
