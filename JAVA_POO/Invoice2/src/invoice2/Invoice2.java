/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoice2;

import javax.swing.JOptionPane;

/**
 *
 * @author tavar
 */
public class Invoice2 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    — o número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double).
    private String numero;
    private String descricao;
    private int quantidade_comprada;
    private double preco_item;

    
    //  Se a quantidade não for positiva, ela deve ser configurada como 0.
    public Invoice2(String numero, String descricao, int quantidade_comprada, double preco_item) {
        this.numero = numero;
        this.descricao = descricao;
        if (quantidade_comprada != 0) {
                    this.quantidade_comprada = quantidade_comprada;
        }
        if (preco_item != 0.0) {
                   this.preco_item = preco_item;
        }
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade_comprada() {
        return quantidade_comprada;
    }

    public void setQuantidade_comprada(int quantidade_comprada) {
 
         if(quantidade_comprada < 0 ){
            System.out.print("quantidade -0 tera o valor de 0 ");
            this.quantidade_comprada = 0;
                      
        
        } else {
            this.quantidade_comprada = quantidade_comprada;
            System.out.print("valor:"+ quantidade_comprada);
        }
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        if(preco_item < 0 ){
            System.out.print("valor -0 tera o valor de 0 ");
            this.preco_item = 0.0;
                      
        
        } else {
            this.preco_item = preco_item;
            System.out.print("valor:"+ preco_item);
        }
       
    }
    
    public void getInvoiceAmount(){
    
        double calculo_fatura = quantidade_comprada * preco_item;
        
        JOptionPane.showConfirmDialog(null, "numero da fatura: " + numero + "\n descrição do produto:" + descricao + "\n quatidade comprada: "+  quantidade_comprada + "\n preço por item: " +  preco_item+ "\n valor total :" + calculo_fatura);
    }
    
    
            
    
    
}
