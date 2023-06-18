/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employe;
import javax.swing.JOptionPane;

/**
 *
 * @author tavar
 */
public class PrincipalTeste {
    
    public static void main (String[] args) {
    
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome: ");
        int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário: "));
    
    Employe employe1 = new Employe(nome, sobrenome, salario);
    {
        JOptionPane.showMessageDialog(null, "nome : " +employe1.getNome() +"\n sobrenome : " +employe1.getSobrenome() +"\n salario : " +employe1.getSalario()+"\n valor do salario anual :"+ employe1.getAnualSalario()+"\n aumento com os 10% :"+ employe1.getAumento_dez() );
    }
    }
}
