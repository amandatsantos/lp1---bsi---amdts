/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employe;
import javax.swing.JOptionPane;

/**
 *
 * @author tavar
 */
public class Employe {

    /**
     * @param args the command line arguments
     */
   private String nome;
   private String sobrenome;
   private double salario;

    public Employe(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario >0 ) {
            this.salario = salario;
        }

        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0 ) {
            this.salario = salario;
        } else {
             JOptionPane.showMessageDialog(null, "salario inferior");
        }
    }
    
    public double getAnualSalario () {
        return salario*12;
    }
    
    public double getAumento_dez () {
        return salario*0.1+salario;
    }
    
   
    
}
