/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resulucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author usuario
 */
public class ResulucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Resolução da tela
Toolkit tk = Toolkit.getDefaultToolkit();
Dimension d = tk.getScreenSize();
        System.out.print("A resolução da sua máquina é: " +d.width + " x " +d.height);
      
    }
    
}
