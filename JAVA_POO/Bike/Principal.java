
package Bike;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        
       Bike b1 = new Bike();
      
        b1.setCor("Pink");
        b1.setMarca("Caloi");
        b1.setAno(2002);
        b1.setVelocidade(8);
        b1.setReducaoVel();
       
        JOptionPane.showMessageDialog(null, "Cor: "+b1.getCor()+"\n"+"Marca: "+b1.getMarca()+"\nAno: "
                +b1.getAno()+ "\nVelocidade: "+b1.getVelocidade()+"\nVelocidade: "+b1.getReducaoVeloc());
    }
    
}
