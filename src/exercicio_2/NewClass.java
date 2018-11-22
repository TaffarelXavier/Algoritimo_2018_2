/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class NewClass {

    public static void main(String[] args) {
        try {
            
            int num1, num2, num3, num4;
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digi te"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digi te"));
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
            num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
// coloca em ordem decrescente 
            if ((num1 != num2) && (num2 != num3) && (num3 != num4)) {
                JOptionPane.showMessageDialog(null, "0rdern decrescente será" + num4 + " " + num3 + " " + num2 + " " + num1);
            } else {
                JOptionPane.showMessageDialog(null, " Por favor, Digite SOMENTE números DIFERENTES" + num1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números !");
        }
    }
}
