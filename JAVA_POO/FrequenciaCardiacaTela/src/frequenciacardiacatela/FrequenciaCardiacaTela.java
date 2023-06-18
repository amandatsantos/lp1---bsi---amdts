/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequenciacardiacatela;

import javax.swing.JOptionPane;

/**
 *
 * @author tavar
 */
public class FrequenciaCardiacaTela {

    //Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
//sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um
//construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método
//que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência
//cardíaca alvo da pessoa. 
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    //private String gender;

    public FrequenciaCardiacaTela(String nome, String sobrenome, int dia, int mes, int ano /*String gender*/) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (dia < 0){
            this.dia = dia;    
            System.out.print("entrada invalida do dia");
        }
        if (mes < 0  && mes < 13) {
            this.mes = mes;
            System.out.print("entrada invalida do mes");
        }
        if (ano > 1900) {
            this.ano = ano;
            System.out.print("entrada invalida do ano");
        }
//        if ( gender == "1" || gender =="2") {
//            this.gender = gender;
//            System.out.print("entrada invalida do genero");
//        
//        }
        
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia>0 && dia<32) {
            this.dia = dia;
        }else {
            JOptionPane.showMessageDialog(null," dia invalido");
        }  
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>0 && mes<32) {
             this.mes = mes;
        }else {
            JOptionPane.showMessageDialog(null," mes invalido");
        }  
       
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        
         if (ano>0 && ano<32) {
            this.ano = ano;
        }else {
            JOptionPane.showMessageDialog(null," ano invalido");
        }  
    }

//    public String getGender() {
//        return gender;
//    }

//    public void setGender(String gender) {
//        if (gender=="1" || gender=="2") {
//           this.gender = gender;
//        }else {
//            JOptionPane.showMessageDialog(null,"gender invalido");
//        }  
//        
//    }
    
    
    
    public void CalcularFrequeciaCardiaca() {
        int calculo_idade = 2023 - ano;
        
        
        
        //if (gender == "1") {
            int frequencia_cardiaca = 260 - calculo_idade;
            double frequencia_cardica_alvo = calculo_idade * 0.85;
            //String gender = "mulher"; 
            JOptionPane.showMessageDialog(null,"nome: " + nome + "\n sobrenome: "+ sobrenome + "\n data de nascimento: "+dia+"/"+mes+"/"+ano +"\n idade:  "+calculo_idade + " \n frequncia cardiaca :" + frequencia_cardiaca + "\n frequnscia cardiaca alvo" +frequencia_cardica_alvo );
            
        //} else if (gender == "2" ) {
            
         //    int frequencia_cardiaca = 220 - calculo_idade;
        //    double frequencia_cardica_alvo = calculo_idade * 0.85;
        //    String gender = "mulher"; 
        //    JOptionPane.showMessageDialog(null,"nome: " + nome + "\n sobrenome: "+ sobrenome + "\n gender" + gender + "\n data de nascimento: "+dia+"/"+mes+"/"+ano +"\n idade:  "+calculo_idade + " \n frequncia cardiaca :" + frequencia_cardiaca + "\n frequnscia cardiaca alvo" +frequencia_cardica_alvo );
        
       // } 
    }
    
    
    
    
    
}
