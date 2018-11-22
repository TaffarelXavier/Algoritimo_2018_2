/**
 * <p>
 * Faça um programa que receba um valor que foi depositado e</p>
 * exiba o valor com rendimento após 4 meses. Considere fixo o juros da poupança em 0,70% a.m.</p>
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
package exercicio_2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Questao_1 {

    //Declaração das variáveis globais:
    static double valorDeposito, taxa,
            tempo, montante, aux;

    static String tipo;

    public static void main(String[] args) {
        try {
            //Em meses:
            tempo = 4;
            //Essa taxa eu divirei por 100, que fica 
            taxa = 70;

            valorDeposito = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Digite o valor de custo: ", "", 2));

            //Como juros simples:
            montante = valorDeposito * (1 + (taxa / 100) * tempo);
            
            tipo = "Simples";

            JOptionPane.showMessageDialog(null,
                    "Como Juros " + tipo + ":\n" + montante, "Atenção", 1);

        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", 1);
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
