package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_1 {

    /**
     * Eu poderia diminuir este código mais de 80% de linhas.
     * @param args
     */
    public static void main(String[] args) {

        //Declaração das variáveis:
        int n1, n2, n3, n4;
        while (true) {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o primeiro número:", "Atenção!", 2));

                n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o segundo número", "Atenção!", 2));
                while (n1 == n2) {
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o segundo número", "Atenção!", 2));
                }

                n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o terceiro número:", "Atenção!", 2));
                while (n2 == n3 || n1 == n3) {
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o terceiro número", "Atenção!", 2));
                }

                n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o quarto número:", "Atenção!", 2));
                while (n1 == n4 || n2 == n4 || n3 == n4) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o quarto número", "Atenção!", 2));
                }

                int[] numeros = new int[4];
                numeros[0] = n1;
                numeros[1] = n2;
                numeros[2] = n3;
                numeros[3] = n4;
                
                //Ordena o array de forma ascendente:
                Arrays.sort(numeros);
                
                //Inverte as posições:
                n4 = numeros[3];
                n3 = numeros[2];
                n2 = numeros[1];
                n1 = numeros[0];
                
                //Saída:
                JOptionPane.showMessageDialog(null,
                        "↓" + n4 + "\n"
                        + "↓" + n3 + "\n"
                        + "↓" + n2 + "\n"
                        + "↓" + n1, "Saída", 1);
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        ex.getMessage(), "Atenção", 1);
            }
        }

    }

}
