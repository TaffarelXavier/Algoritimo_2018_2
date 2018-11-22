/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outras.classes;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class DecimalFormato {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        
        double x1, x2, r;
        
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Dig valor de x1"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Dig valor de x2"));
        
        r = x1 / x2;
        
        JOptionPane.showMessageDialog(null, " O r de " + x1 + "/" + x2 + " é: " + df.format(r));
    }
}
