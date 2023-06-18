/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoicetela;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class InvoiceTela {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    private String numero_fatura ;
    private String descricao;
    private int quantidade_comprada;
    private double preco_item;

    public InvoiceTela(String numero_fatura, String descricao, int quantidade_comprada, double preco_item) {
        this.numero_fatura = numero_fatura;
        this.descricao = descricao;
        this.quantidade_comprada = quantidade_comprada;
        this.preco_item = preco_item;
    }

    public String getNumero_fatura() {
        return numero_fatura;
    }

    public void setNumero_fatura(String numero_fatura) {
        this.numero_fatura = numero_fatura;
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
        this.quantidade_comprada = quantidade_comprada;
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        this.preco_item = preco_item;
    }
    
    public void getInvoiceAmout(){
        double calculo_invoice = quantidade_comprada*preco_item;
        JOptionPane.showMessageDialog(null, "numero fatura : " + numero_fatura + "\n descrição produto:"+ descricao +"\n quantidade produto:" + quantidade_comprada+" \n preco por item : "+ preco_item+ "\n valor total : " + calculo_invoice );
     
    }
    
}
