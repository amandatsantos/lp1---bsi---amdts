
package Escola;
import javax.swing.JOptionPane;
public class Aluno {
    
     
    String matricula;
    String situacao;
    String matriculacao;
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public void setMatricular(String T, String F){
        if(this.situacao.equals("legal")&&this.matricula.equals("sem matricula")){
           this.matriculacao = ("Matriculado");
        }
        else{
            this.matriculacao = ("Dispensado");
        }
    }
    public String getMatricular() {
        if(this.matriculacao.equals("Matriculado")){
            JOptionPane.showMessageDialog(null, "Você foi matriculado");
            
        }
        else if(this.matriculacao.equals("Dispensado")){
            
            JOptionPane.showMessageDialog(null, "Não esta matriculado");
        }
        return null;
        
       }
    
    public void setFormado(String sw){
        if(sw.equals("concluio") && this.matriculacao.equals("Matriculado")){
            JOptionPane.showMessageDialog(null, "Formadoo !!!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não formou ainda");
        }
    }
    
    public void setEvadir(String re){
        if(re.equals("saiu")&&this.matriculacao.equals("Matriculado")){
            JOptionPane.showMessageDialog(null, "O aluno não esta mais no curso ");
        }
        else{
            JOptionPane.showMessageDialog(null, "O aluno continua no curso");
        }
    }
}
