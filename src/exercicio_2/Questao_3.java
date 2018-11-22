package exercicio_2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_3 {

    //Percentagem do distribuidor já transformados
    static final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
    //Impostos já transformados
    static final double IMPOSTOS = 0.45;

    public static void main(String[] args) {

        double custoCarroNovo,
                custoAoConsumidor, custoDeFabrica;
        try {

            custoDeFabrica = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o custo de fábrica:", "Atenção!", 2));

            custoCarroNovo = (custoDeFabrica * IMPOSTOS) * PORCENTAGEM_DISTRIBUIDOR;
            
            custoAoConsumidor = custoDeFabrica + custoCarroNovo;

            JOptionPane.showMessageDialog(null, "R$ " + custoAoConsumidor, "Atenção", 1);

        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "R$" + ex.getMessage(), "Atenção", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.",
                    "Atenção", 0);
            System.exit(0);
        }
    }
}
