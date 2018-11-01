
package algoritimo_2018_2.exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_2 {

    /**
     *
     * @param sexo
     * @return
     */
    public static double calcucarPesoIdeal(String sexo) {

        double altura = 0;

        while (altura == 0) {
            try {
                if (sexo.equalsIgnoreCase("M")) {
                    altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Digite a altura para o sexo M"));
                    return (72.7 * altura) - 58;
                } else if (sexo.equalsIgnoreCase("F")) {
                    altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Digite a altura para o sexo F"));
                    return (62.1 * altura) - 44.7;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Inicialização das variáveis:

        String sexo, msgInfo = "Digite:\nF=para o sexo feminino e\nM=para masculino.";
        //<!--FIM

        sexo = JOptionPane.showInputDialog(null, msgInfo);

        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
            sexo = JOptionPane.showInputDialog(null, msgInfo);
        }

        JOptionPane.showMessageDialog(null, "Peso ideal: " + calcucarPesoIdeal(sexo) + "kg");
    }
}
