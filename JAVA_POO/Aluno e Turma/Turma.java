
package Escola;
import javax.swing.JOptionPane;

public class Turma extends Aluno {
     
    int ano;
    int semestre;
    int diaSemana;
    String horarios;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public void setAbrirTurma(int ano){
        if(this.situacao.equals("legal")){
            
         JOptionPane.showMessageDialog(null, "A turma de "+this.ano+" foi aberta com sucesso");
        }
        else {
            JOptionPane.showMessageDialog(null, "Turma não aberta");
        }
        }}

