package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_9 {
    
    //Declaração das variáveis:
    static double valorDeposito, taxa,
            tempo, montante, aux;
    static String tipo;

    /**
     *
     * @param tipo
     */
    public static void calcular(String tipo) {

        // while (true) {
        try {
            tempo = 4;
            taxa = 70;

            valorDeposito = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Digite o valor de custo: ", "", 2));
            //Como juros simples:
            if (tipo.equalsIgnoreCase("simples") || tipo.equalsIgnoreCase("s")) {
                aux = 1 + (taxa / 100);
                montante = valorDeposito * (aux * tempo);
                tipo = "Simples";
            } else {
                //Como juros compostos:
                aux = 1 + ((taxa / 100));
                montante = valorDeposito * Math.pow(aux, tempo);
                tipo = "Composto";
            }
            JOptionPane.showMessageDialog(null,
                    "Como Juros " + tipo + ":\n" + montante, "Atenção", 1);

        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", 1);
        } catch (Exception e) {
            System.exit(0);
        }

        //}
    }

    public static void main(String[] args) {
        int k = 0;
        while (true) {
            k++;
            if (k % 2 == 0) {
                calcular("s");
            } else {
                calcular("composto");
            }
        }

    }

}
