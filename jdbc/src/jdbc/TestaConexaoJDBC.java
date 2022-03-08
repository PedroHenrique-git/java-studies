package jdbc;

import java.sql.*;

public class TestaConexaoJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_test", "root", "root");			
		} catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
