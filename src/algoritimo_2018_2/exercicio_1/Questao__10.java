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
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao__10 {

    public static void main(String[] args) {
        double precoDeCusto, percentual, valorDeVenda;

        while (true) {
            try {
                precoDeCusto = Integer.parseInt(JOptionPane.
                        showInputDialog(null,
                                "Digite o preço de custo do produto.", "", 2));

                percentual = Integer.parseInt(JOptionPane.
                        showInputDialog(null,
                                "Digite o pecentual do produto.", "", 2));

                valorDeVenda = (precoDeCusto * (percentual / 100)) + precoDeCusto;
                //Mostra o valor de venda
                JOptionPane.showMessageDialog(null,
                        "R$ " + valorDeVenda, "Atenção", 1);
                //Sai do sistema

            } catch (HeadlessException | NumberFormatException e) {
                if (e.getMessage().equals("null")) {
                    JOptionPane.showMessageDialog(null, 
                            "Você está saindo do sistema, até mais!", "Atenção", 1);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", 1);
                }
            }
        }

    }
}
