
package Bike;

public class Bike {
    
    private String cor;
    private String marca;
    private int ano;
    private int velocidade;
    private int reducaoVeloc;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getReducaoVeloc() {
        return reducaoVeloc;
    }

    public void setReducaoVeloc(int reducaoVeloc) {
        this.reducaoVeloc = reducaoVeloc;
    }
    
     public void setReducaoVel (){
        if (this.velocidade>10){
            this.reducaoVeloc = this.velocidade - 20;
            
        }
     }
}
