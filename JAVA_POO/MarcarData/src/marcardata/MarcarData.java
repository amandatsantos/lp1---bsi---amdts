/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcardata;

import javax.swing.JOptionPane;

/**
 *
 * @author tavar
 */
public class MarcarData {

    /**
     * @param args the command line arguments
     */
    
    private int mes;
    private int dia;
    private int ano;
    
    public MarcarData(int mes, int dia, int ano) {
        if ( mes > 0 &&  mes < 12 ) {
             this.mes = mes;
              System.out.println("entrada correta mes");
            
        }
        if ( dia <31 ) {
             this.dia = dia;
              System.out.println("entrada correta dia");
            
        }
        if ( ano > 0 ) {
             this.ano = ano;
              System.out.println("entrada correta ano");
            
        }
       
        
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >0 && mes < 13) {
             this.mes = mes;
        } else {
            JOptionPane.showMessageDialog(null, "entrad incorreta do mes");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >0 && dia < 31) {
             this.dia = dia;
        } else {
            JOptionPane.showMessageDialog(null, "entrad incorreta do dia");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >0) {
             this.ano = ano;
        } else {
            JOptionPane.showMessageDialog(null, "entrad incorreta do ano");
        }
       
    }
    
    public void displayDate () {
    
    JOptionPane.showMessageDialog(null, dia+"/"+mes+"/"+ano);
    }

   
    
}
