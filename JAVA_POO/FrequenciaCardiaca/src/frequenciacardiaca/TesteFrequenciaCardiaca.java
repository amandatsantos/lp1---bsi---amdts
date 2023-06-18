/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frequenciacardiaca;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class TesteFrequenciaCardiaca {
    
        public static void main(String[] args) {
//        // TODO code application logic here
        
        String nome = JOptionPane.showInputDialog(null, "insira o seu nome");
        String sobrenome = JOptionPane.showInputDialog(null, "insira o seu sobrenome");
        int gender = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o seu genero 1- mulher 2- homem (entre a apenas com o valor 1 ou 2)"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o seu dia de nascmento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o seu mes de  nascimento"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o seu ano de  nasciemnto"));

        
        FrequenciaCardiaca frequenciaCardia1 = new  FrequenciaCardiaca (nome, sobrenome, gender,  dia , mes,ano );
        frequenciaCardia1.CalcularIdade();
        
    }
    
}
