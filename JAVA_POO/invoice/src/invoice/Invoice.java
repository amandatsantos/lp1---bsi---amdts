/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoice;

/**
 *
 * @author tavar
 */
public class Invoice {

    private String numero;
    private String descricao;
    private int quant_comprada_item;
    private double preco_item;
//
    public Invoice(String numero, String descricao, int quant_comprada_item, double preco_item) {
        this.numero = numero;
        this.descricao = descricao;
        this.quant_comprada_item = quant_comprada_item;
        this.preco_item = preco_item;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = "00-00";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = "item" ;
    }

    public int getQuant_compradada_item() {
        return quant_comprada_item;
    }

    public void setQuant_comprada_item(int quant_comprada_item) {
       if (quant_comprada_item > 0){
           this.quant_comprada_item = quant_comprada_item;
       } else {
        this.quant_comprada_item = 0; }
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        if (preco_item > 0.0) {
        this.preco_item = preco_item; }
        else {
            this.preco_item = 0.0; 
        }
    }

    public double getInvoiceAmout() {
    return quant_comprada_item * preco_item;}
    
}
