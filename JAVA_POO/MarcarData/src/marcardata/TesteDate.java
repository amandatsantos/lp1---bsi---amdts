/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcardata;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class TesteDate {
    
     public static void main (String[] args) {
     
     int  dia = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o dia: "));
     int  mes = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o mes: "));
     int  ano = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o ano: "));

     MarcarData marcarData1 = new MarcarData(mes, dia, ano) ;
         
     marcarData1.displayDate()
             ;
     
     
         
     }
    
}
