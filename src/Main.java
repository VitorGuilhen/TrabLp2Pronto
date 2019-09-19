import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws SQLException{
      String opt = JOptionPane.showInputDialog("1 - Salvar\n2 - Buscar\n3 - Remover\n4 - Atualizar");
      EntradaDeDados edd = new EntradaDeDados();
      
      if(opt.equals("1")){
          String opt2 = JOptionPane.showInputDialog("1 - Aluno\n2 - Professor");
          if(opt2.equals("1")){
              edd.entradaA();
          }else if(opt2.equals("2")){
              edd.entradaP();
          }else JOptionPane.showMessageDialog(null, "Opção inválida!!");
          
      }else if(opt.equals("2")){
          String opt2 = JOptionPane.showInputDialog("1 - Aluno\n2 - Professor");
          if(opt2.equals("1")){
        	  String opt3 = JOptionPane.showInputDialog("1 - Buscar todos\n2 - Buscar por ID");
        	  if(opt3.equals("2")) {
              edd.exibirA();
        	  }
        	  else if(opt3.equals("1")){
        		  edd.exibirTodosA();
        	  }
        	  else JOptionPane.showMessageDialog(null, "Opção inválida!!");
        	  
          }else if(opt2.equals("2")){
        	  String opt3 = JOptionPane.showInputDialog("1 - Buscar todos\n2 - Buscar por ID");
        	  if(opt3.equals("2")) {
              edd.exibirP();
        	  }
        	  else if(opt3.equals("1")){
        		  edd.exibirTodosP();
        	  }
        	  else JOptionPane.showMessageDialog(null, "Opção inválida!!");
          }else JOptionPane.showMessageDialog(null, "Opção inválida!!");
          
      }
      else if(opt.equals("3")){
          String opt2 = JOptionPane.showInputDialog("1 - Aluno\n2 - Professor");
          if(opt2.equals("1")){
              edd.removerA();
          }else if(opt2.equals("2")){
              edd.removerP();
          }else JOptionPane.showMessageDialog(null, "Opção inválida!!");
          
      }
      else if(opt.equals("4")){
          String opt2 = JOptionPane.showInputDialog("1 - Aluno\n2 - Professor");
          if(opt2.equals("1")){
              edd.atualizarA();
          }else if(opt2.equals("2")){
              edd.atualizarP();
          }else JOptionPane.showMessageDialog(null, "Opção inválida!!");
          
      }
      else JOptionPane.showMessageDialog(null, "Opção inválida!!");
      
      
    }
    
}