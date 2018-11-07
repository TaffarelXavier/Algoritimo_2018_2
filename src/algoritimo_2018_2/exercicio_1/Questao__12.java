package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao__12 {

    public static void main(String[] args) {
        //Declaração das variáveis:
        int numero;

        //Permite fazer vários teste sem sair 
        //do programa e fazer a compilação novamente.
        while (true) {
            try {

                numero = (int) Integer.parseInt(JOptionPane.
                        showInputDialog(null, "Digite algum número positivo:", "", 1));

                //Se o valor informado for menor que zero:
                if (numero < 0) {
                    JOptionPane.showMessageDialog(null,
                            "O número é menor que zero.", "Atenção", 2);
                } else {
                    if (numero % 2 == 0) {
                        JOptionPane.showMessageDialog(null,
                                "O número " + numero + " é par", "Atenção", 1);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Este número não é positivo.", "Atenção", 0);
                    }
                }

            } catch (HeadlessException | NumberFormatException ex) {
                //Se o cliente clicar em cancelar.
                if (ex.getMessage().equalsIgnoreCase("null")
                        || null == ex.getMessage()) {
                    JOptionPane.showMessageDialog(null, "Você está saindo do sistema. Até mais!",
                            "Atenção", 2);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, ex.getMessage(),
                            "Atenção", 2);
                }
            }
        }
    }
}
