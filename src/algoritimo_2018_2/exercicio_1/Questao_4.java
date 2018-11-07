/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_4 {

    public static void main(String[] args) {
        int n1, n2, n3, resultado = 0;
        String operador;

        operador = JOptionPane.showInputDialog(null, "Digite o operador:",
                "Atenção", 1);
        while (!operador.equalsIgnoreCase("+")
                && !operador.equalsIgnoreCase("-")
                && !operador.equalsIgnoreCase("*")
                && !operador.equalsIgnoreCase("/")) {
            operador = JOptionPane.showInputDialog(null, "Digite o operador:",
                    "Atenção", 2);
        }
        
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o primeiro número:", "Atenção", 1));
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o segundo número:", "Atenção", 1));
            n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o terceiro número:", "Atenção", 1));

            if (operador.equalsIgnoreCase("*")) {
                resultado = n1 * n2 * n3;
                operador = "multiplicação";
            } else if (operador.equalsIgnoreCase("/")) {
                resultado = n1 / n2 / n3;
                operador = "divisão";
            } else if (operador.equalsIgnoreCase("+")) {
                resultado = n1 + n2 + n3;
                operador = "soma";
            } else if (operador.equalsIgnoreCase("-")) {
                resultado = n1 - n2 - n3;
                operador = "subtração";
            }

            JOptionPane.showMessageDialog(null, "A " + operador
                    + " dos números:\n" + n1 + "," + n2 + "," + n3
                    + " é igual a " + resultado,
                    "Atenção", 1);

        } catch (HeadlessException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        System.exit(0);
    }

}
