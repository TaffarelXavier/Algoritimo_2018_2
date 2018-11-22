/**
 * <p>
 * Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
 * percentual informado pelo usuário.</p>
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
package exercicio_2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Questao_2 {

    public static void main(String[] args) {

        //Declarações das variáveis locais:
        double precoDeCusto,
                percentual, valorDeVenda;

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