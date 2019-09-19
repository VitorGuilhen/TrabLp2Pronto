import java.awt.HeadlessException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class EntradaDeDados {


	DAO dao = new DAO();
    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();
    Professor professor = new Professor();
       public void entradaA() throws SQLException{
    	       aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ra: ")));
	    	   aluno.setNome(JOptionPane.showInputDialog("Entre com o nome: "));
	    	   aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade: ")));
	    	   aluno.setCpf(JOptionPane.showInputDialog("Entre com o cpf: "));
	    	   aluno.setSexo(JOptionPane.showInputDialog("Entre com o sexo: "));
	           dao.salvarA(aluno);
       }
       public void entradaP() throws SQLException{
	    	   professor.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Entre com o siape: ")));
	    	   professor.setNome(JOptionPane.showInputDialog("Entre com o nome: "));
	    	   professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade: ")));
	    	   professor.setCpf(JOptionPane.showInputDialog("Entre com o cpf: "));
	    	   professor.setSexo(JOptionPane.showInputDialog("Entre com o sexo: "));
	           dao.salvarP(professor);
	   }   
       
       public void atualizarA() throws SQLException{
	    	   aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ra do aluno a ser atualizado: ")));
	    	   aluno.setNome(JOptionPane.showInputDialog("Entre com o nome(atualizado, ou não): "));
	    	   aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade(atualizada, ou não): ")));
	    	   aluno.setCpf(JOptionPane.showInputDialog("Entre com o cpf(atualizado, ou não): "));
	    	   aluno.setSexo(JOptionPane.showInputDialog("Entre com o sexo(atualizado, ou não): "));
	           dao.atualizarA(aluno);
       }
       public void atualizarP() throws SQLException{
	    	   professor.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Entre com o siape do professor a ser atualizado: ")));
	    	   professor.setNome(JOptionPane.showInputDialog("Entre com o nome(atualizado, ou não): "));
	    	   professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade(atualizada, ou não): ")));
	    	   professor.setCpf(JOptionPane.showInputDialog("Entre com o cpf(atualizado, ou não): "));
	    	   professor.setSexo(JOptionPane.showInputDialog("Entre com o sexo(atualizado, ou não): "));
	           dao.atualizarP(professor);
       }
       
       public void removerA() throws SQLException{
    	   aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ra do aluno a ser deletado: ")));
           dao.removerA(aluno);
           JOptionPane.showMessageDialog(null, "Aluno do ra " + aluno.getRa() + " foi deletado com sucesso.");
       }
       public void removerP() throws SQLException{   
    	   professor.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Entre com o siape do professor a ser deletado: ")));
           dao.removerP(professor);
           JOptionPane.showMessageDialog(null, "Professor do siape " + professor.getSiape() + " foi deletado com sucesso.");
       }
       
       public void exibirA() throws SQLException {
    	   aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ra do aluno a ser exibido: ")));
    	   JOptionPane.showMessageDialog(null, dao.exibirA(aluno));    	   
       }
       public void exibirP() throws SQLException {
    	   professor.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Entre com o siape do professor a ser exibido: ")));
    	   JOptionPane.showMessageDialog(null, dao.exibirP(professor));
       }       
       
       public void exibirTodosA() throws HeadlessException, SQLException {
    	   JOptionPane.showMessageDialog(null, dao.exibirTodosA());
       }
       public void exibirTodosP() throws HeadlessException, SQLException {
    	   JOptionPane.showMessageDialog(null, dao.exibirTodosP());
       }
}