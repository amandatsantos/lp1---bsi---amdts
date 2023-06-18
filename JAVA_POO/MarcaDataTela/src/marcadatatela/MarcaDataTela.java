/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcadatatela;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class MarcaDataTela {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
        
        private int dia;
        private int mes;
        private int ano; 
        
        
    //}

    public MarcaDataTela(int dia, int mes, int ano) {
        if (dia < 0 && dia < 32) {
        this.dia = dia;
            System.out.print("\n dia, entrada correta");}
        if(mes <0 && mes<13){
        this.mes = mes;
            System.out.print("mes, entrada correta");}
        if(ano> 1900){
        this.ano = ano;
            System.out.print("ano, entrada correta");}
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >0 && dia < 32) {
        this.dia = dia;
            System.out.print("\n dia, entrada correta");} 
        else {
            JOptionPane.showInternalInputDialog(null, "erro na inserção do dia");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
          if (mes >0 && mes < 32) {
        this.mes = mes;
            System.out.print("\n mes, entrada correta");} 
        else {
            JOptionPane.showInternalInputDialog(null, "erro na inserção do mes");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
           if (ano >0 && ano < 32) {
        this.ano = ano;
            System.out.print("\n ano, entrada correta");} 
        else {
            JOptionPane.showInternalInputDialog(null, "erro na inserção do, ano");
        }
           
       }
    public void Calendario(){
        JOptionPane.showMessageDialog(null, dia +"/"+ mes+ "/" + ano);
    
    }
    
}
