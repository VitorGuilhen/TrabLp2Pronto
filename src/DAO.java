import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	
	Connection con =  (Connection) Conexao.getConnection();

    public void salvarA(Aluno aluno) throws SQLException{   
    	String sql = "insert into Aluno (ra, nome, idade, cpf, sexo) values (?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, aluno.getRa());
		preparador.setString(2, aluno.getNome());
		preparador.setInt(3, aluno.getIdade());
		preparador.setString(4, aluno.getCpf());
		preparador.setString(5, aluno.getSexo());
		preparador.execute();
		preparador.close();
    }
    public void salvarP(Professor professor) throws SQLException{
    	String sql = "insert into Professor (siape, nome, idade, cpf, sexo) values (?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, professor.getSiape());
		preparador.setString(2, professor.getNome());
		preparador.setInt(3, professor.getIdade());
		preparador.setString(4, professor.getCpf());
		preparador.setString(5, professor.getSexo());
		preparador.execute();
		preparador.close();
    }
    
    public String exibirA(Aluno aluno) throws SQLException{    	
    		String sql = 
    		"select * from aluno where ra = ?";   		
    		PreparedStatement preparador = con.prepareStatement(sql);
    		preparador.setInt(1,aluno.getRa());
    		ResultSet rs = preparador.executeQuery();
                String retornaAluno = "";
    		
    		while (rs.next()) {
    			retornaAluno = "Id: " + rs.getInt("Ra") + "\n"
                        + "Nome: " + rs.getString("Nome") + "\n"
    			+ "Idade: " + rs.getInt("Idade") + "\n"
    			+ "Cpf: " + rs.getString("Cpf") + "\n"
    			+ "Sexo: " + rs.getString("Sexo");
    		}
    		rs.close();
    		preparador.close();
    		return retornaAluno;   	
    }
    public String exibirP(Professor professor) throws SQLException {
                String sql = 
    		"select * from professor where siape = ?";   		
    		PreparedStatement preparador = con.prepareStatement(sql);
    		preparador.setInt(1,professor.getSiape());
    		ResultSet rs = preparador.executeQuery();
                String retornaProfessor = "";
    		
    		while (rs.next()) {
    			retornaProfessor = "Id: " + rs.getInt("Siape") + "\n"
                        + "Nome: " + rs.getString("Nome") + "\n"
    			+ "Idade: " + rs.getInt("Idade") + "\n"
    			+ "Cpf: " + rs.getString("Cpf") + "\n"
    			+ "Sexo: " + rs.getString("Sexo");
    		}
    		rs.close();
    		preparador.close();
    		return retornaProfessor;
    }
    
    public String exibirTodosA() throws SQLException {    					    		
    		String sql = "select * from aluno";
    		PreparedStatement preparador = con.prepareStatement(sql);
    		ResultSet rs = preparador.executeQuery();
                String retornaTodosAlunos = "";
    		while(rs.next()) {
    			
    			
    			retornaTodosAlunos += "Ra: " + rs.getInt("Ra") + " \\ "
    			+ "Nome: " + rs.getString("Nome") + " \\ "
    			+ "Idade: " + rs.getInt("Idade") + " \\ "
    			+ "Cpf: " + rs.getString("Cpf") + " \\ "
    			+ "Sexo: " + rs.getString("Sexo") + "\n";	                       
    		}	   		
    		return retornaTodosAlunos;		
    	}
    public String exibirTodosP() throws SQLException {
		String sql = "select * from Professor";
    		PreparedStatement preparador = con.prepareStatement(sql);
    		ResultSet rs = preparador.executeQuery();
                String retornaTodosProfessores = "";
    		while(rs.next()) {
    			
    			
    			retornaTodosProfessores += "Siape: " + rs.getInt("Siape") + " \\ "
    			+ "Nome: " + rs.getString("Nome") + " \\ "
    			+ "Idade: " + rs.getInt("Idade") + " \\ "
    			+ "Cpf: " + rs.getString("Cpf") + " \\ "
    			+ "Sexo: " + rs.getString("Sexo") + "\n";	                       
    		}	   		
    		return retornaTodosProfessores;		
	}
    
    public void removerA(Aluno aluno) throws SQLException{           
    	String sql = "delete from Aluno where ra = ?";
    	PreparedStatement preparador = con.prepareStatement(sql);
    	preparador.setInt(1,aluno.getRa());
    	preparador.execute();
    	preparador.close();
    }
    public void removerP(Professor professor) throws SQLException{           
		String sql = "delete from Professor where ra = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1,professor.getSiape());
		preparador.execute();
		preparador.close();
    }
    
    public void atualizarA(Aluno aluno) throws SQLException {
    	String sql = "update Aluno set nome = ?, idade = ?, cpf = ?, sexo = ? where ra = ? ";
    					PreparedStatement preparador = con.prepareStatement(sql);
    					preparador.setString(1, aluno.getNome());
    					preparador.setInt(2, aluno.getIdade());
    					preparador.setString(3, aluno.getCpf());
    					preparador.setString(4, aluno.getSexo());
    					preparador.setInt(5, aluno.getRa());
    					preparador.execute();
    					preparador.close();
    }
    public void atualizarP(Professor professor) throws SQLException {
    	String sql = "update Professor set nome = ?, idade = ?, cpf = ?, sexo = ? where siape = ? ";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, professor.getNome());
			preparador.setInt(2, professor.getIdade());
			preparador.setString(3, professor.getCpf());
			preparador.setString(4, professor.getSexo());
			preparador.setInt(5, professor.getSiape());
			preparador.execute();
			preparador.close();
    }
}