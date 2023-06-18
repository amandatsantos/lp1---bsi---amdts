
package Escola;
import javax.swing.JOptionPane;
public class Principal {

  
    public static void main(String[] args) {
        
        Aluno Lux = new Aluno();
        Turma Ahri = new Turma();
        
        Ahri.setAno(2023);
        Lux.setMatricula("sem matricula");
        Lux.setSituacao("legal");
        
        Lux.setMatricular(Lux.getSituacao(), Lux.getMatricula());
        
        Lux.getMatricular();
        Lux.setFormado("Não concluio");
        Lux.setEvadir("saiu");
       
        Ahri.setSituacao("legal");
        Ahri.setAbrirTurma(Ahri.getAno());
    
    }
    }
