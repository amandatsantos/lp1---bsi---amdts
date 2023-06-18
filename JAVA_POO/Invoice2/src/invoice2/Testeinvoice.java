/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice2;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class Testeinvoice {
    
     public static void main(String[] args) {
//        // TODO code application logic here

    String numero = JOptionPane.showInputDialog(null, "insira o numero de serie da fatura:");
    String descricao = JOptionPane.showInputDialog(null,"insira a descrição do produto:" );
    int quantidade_comprada = Integer.parseInt(JOptionPane.showInputDialog(null, "quatidade do produto:"));
    double preco_item = Double.parseDouble(JOptionPane.showInputDialog(null, "preco do item:"));

    Invoice2 invoce = new Invoice2 (numero,descricao,quantidade_comprada, preco_item );
    
    invoce.getInvoiceAmount();
    
    }
    
}
