import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lp2","root","");
		}
		
		catch(SQLException e) {
			System.out.println("Erro de conexão" + e.getMessage());
		}
		
		return con;
	}

}
