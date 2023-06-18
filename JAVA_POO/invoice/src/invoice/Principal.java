/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoice;
import javax.swing.JOptionPane;
//        
//
///**
// *
// * @author tavar
// */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Invoice v1 = new Invoice("00-01",  "xxxxx", 5 ,  20.0) ;
        String precoItemString = String.valueOf(v1.getPreco_item()); // Converter para string
        JOptionPane.showMessageDialog(null, " informações da compra \n"+ v1.getDescricao()+ 
                "\n"+v1.getNumero() + "\n" + precoItemString +"\n"+ v1.getQuant_compradada_item()+"\n"+ v1.getInvoiceAmout());
        
    }
    
}
