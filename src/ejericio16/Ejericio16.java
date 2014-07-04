/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejericio16;

import javax.swing.JOptionPane;


/**
 *
 * @author Isaac
 */
public class Ejericio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Valor para X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Valor para Y"));
        int z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Valor para Z"));
        int [] cadena = null;
        
        int valor=z-y;
        int resltado=0,i=0;
        if (x>255||y>255||z>255||x<=0||y<=0||z<=0) {
            resltado=-1;
            i=z;
        }
        else{
            if (y>z) {
            resltado=0;
            i=z;
            }
        }
        
        for (int j =i; j < z; j++) {
            
            x=x*valor;
            valor=valor+2;
            cadena[j]=x;
            
        }
        for (int m = 0; m <z; m++) {
            if (m>(y-1)) {
              resltado=resltado+cadena[m];  
            }

        }
        
        
        JOptionPane.showMessageDialog(null, resltado);
    }
    
    
}
