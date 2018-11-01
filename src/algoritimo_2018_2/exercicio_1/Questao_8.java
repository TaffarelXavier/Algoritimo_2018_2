/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_8 {

    /**
     *
     * @param c O número representando o valor de Celsius.
     * @return
     */
    public static double convertCelsiusParaFahrenheit(double c) {
        return (9 * c + 160) / 5;
    }

    public static void main(String[] args) {
        int c = 0, k = 0;
        while (true) {

            try {
                k++;
                c = Integer.parseInt(JOptionPane.showInputDialog(null, "[" + k + "]\nDigite um valor númerico para Celsius"));
                JOptionPane.showMessageDialog(null, convertCelsiusParaFahrenheit(c), "Atenção", 1);
            } catch (NumberFormatException e) {
            }

        }
    }
}
