/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interescompuesto;

import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class InteresCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int c1,c2,c3,i,mes = 0;
        
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Capital de Pedro: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Capital de Juan: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de la inversión: "));
        
        
        //Processing
        i = c1 + c2;
        
        while(i < c3){
            mes += 1;
            if(mes%2 == 0){
                c1 = c1 + (c1*3/100);
                c2 = c2 + (c2*5/100);
                i = c1 + c2;
            }
            else{
                c1 = c1 + (c1*3/100);
                c2 = c2 + (c2*4/100);
                i = c1 + c2;
            }
        }
        
        //Fin
        JOptionPane.showMessageDialog(null, "Se tardaran " + mes + " meses en conseguirlo");
        System.exit(0);
    }
    
}
