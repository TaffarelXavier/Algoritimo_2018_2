/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_6 {

    private static int soma = 0;

    public static void main(String args[]) {
        int i;

        for (i = 1; i < 100; i++) {
            if (i <= 3) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "Somatório:" + soma);
    }
}
