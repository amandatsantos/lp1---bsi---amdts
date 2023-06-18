/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequenciacardiaca;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class FrequenciaCardiaca {

    /**
     * @param args the command line arguments
     */
    
    private String nome;
    private String sobrenome;
    private int  gender;
    //data
    private int dia;
    private int mes;
    private int ano;
    
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }

    public FrequenciaCardiaca(String nome, String sobrenome, int gender, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.gender = gender;
        
        if (gender != 1 || gender !=2) {
            this.gender = gender;
            System.out.print("entrada correta gender");
        }
        
        if (dia > 0 && dia <32) {
            this.dia = dia;
            System.out.print("entrada correta dia");
        }
        if (mes > 0 && mes <13) {
             this.mes = mes;
            System.out.print("entrada correta mes");
        }
        if (ano > 1900) {
            this.ano = ano;
            System.out.print("entrada correta ano");
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        
        if (gender !=1 || gender != 2) {
            this.gender = gender;
        } else {
        
        JOptionPane.showMessageDialog(null, "entrada incorreta, utilize apenas 1 / 2");}
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >0 && dia <32) {
            this.dia = dia;
        }
        else {
        JOptionPane.showMessageDialog(null, "entrada incorreta, comece o cadastro novamente");
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >0 && mes <12) {
            this.mes = mes;
        }
        else {
        JOptionPane.showMessageDialog(null, "entrada incorreta, comece o cadastro novamente");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
         if (ano > 1900) {
            this.ano = ano;
        }
        else {
        JOptionPane.showMessageDialog(null, "entrada incorreta, comece o cadastro novamente");
        }
    }
    // calcule e retorne a idade (em anos) 
    // esse metodo calcula a idade fremax e freq alvo
    public void CalcularIdade(){
    int idadePaciente = ano -2023; 
   // JOptionPane.showMessageDialog(null, "idade é \n" + idadePaciente);
    if ( gender == 1){
        int cardiacaMax = 226 - idadePaciente ;
        double freqAlvo = cardiacaMax*0.85;
        JOptionPane.showMessageDialog(null, "idade :\n" + idadePaciente +"\n cardiaca maxima:"+cardiacaMax + "\n frequncia alvo:" +freqAlvo );
    } else if (gender == 2)  {
        int cardiacaMax = 220 - idadePaciente;
         double freqAlvo = cardiacaMax*0.85;
        JOptionPane.showMessageDialog(null, "idade : \n" + idadePaciente +"\n cardiaca maxima:"+cardiacaMax + "\n frequncia alvo:"+freqAlvo );
    }
    
    }
    //  calcule e retorne a frequência cardíaca máxima  
    // calcule e retorne a frequência cardíaca alvo da pessoa
    
//    public void CalcularfreqMaxima() {
//    
//
//    if ( gender == 1){
//        int cardiacaMax = 226 - idadePaciente ;
//    } else {
//    
//    }
//    }
//    
}
