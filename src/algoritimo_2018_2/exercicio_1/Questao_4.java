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
public class Questao_4 {

    public static void main(String[] args) {
        int n1, n2, n3, resultado;
        String operador;

        operador = JOptionPane.showInputDialog(null, "Digite o operador:", "Atenção", 1);
        while (!operador.equalsIgnoreCase("+")
                && !operador.equalsIgnoreCase("-")
                && !operador.equalsIgnoreCase("*")
                && !operador.equalsIgnoreCase("/")) {
            operador = JOptionPane.showInputDialog(null, "Digite o operador:", "Atenção", 2);
        }

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número:", "Atenção", 1));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:", "Atenção", 1));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número:", "Atenção", 1));

        if (operador.equalsIgnoreCase("*")) {
            resultado = n1 + n2 + n3;
        } else if (operador.equalsIgnoreCase("/")) {
            resultado = n1 / n2 / n3;
        } else if (operador.equalsIgnoreCase("+")) {
        } else if (operador.equalsIgnoreCase("-")) {
        }

    }

}
