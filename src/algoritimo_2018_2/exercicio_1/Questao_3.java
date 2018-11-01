package algoritimo_2018_2.exercicio_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_3 {

    /**
     *
     * @param txt
     * @return
     */
    public static String stilTexto(String txt) {
        return "<html><body><p style='color:green'>" + txt + "</p></body></html>";
    }

    /**
     *
     * @param txt
     * @return
     */
    public static String[] formatarString(String txt) {
        return txt.split(" ");
    }

    public static void main(String[] args) {
        int dia, mes, ano;

        while (true) {
            try {
                dia = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o DIA do seu nascimento:"));
                while (dia == 0 || dia > 31) {
                    dia = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o DIA, corretamente, do seu nascimento:"));
                }

                mes = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o MÊS do seu nascimento:"));
                while (mes == 0 || mes > 12) {
                    mes = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o MÊS, corretamente, do seu nascimento:"));
                }

                ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o ANO do seu nascimento:"));
                while (ano == 0) {
                    ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o ANO, corretamente, do seu nascimento:"));
                }
                
                JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano, "Atenção", 1);

            } catch (NumberFormatException e) {
                String[] str = formatarString(e.getMessage());
                if (str[0].equalsIgnoreCase("For")) {
                    JOptionPane.showMessageDialog(null,
                            "O valor digitado (" + str[3] + ") é incorreto.", "Atenção", 1);
                }
            }
        }

    }
}
