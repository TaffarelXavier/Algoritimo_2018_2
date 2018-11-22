/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao__11 {

    static final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
    static final double IMPOSTOS = 0.45;

    public static BigDecimal parse(final String amount, final Locale locale) throws ParseException {
        final NumberFormat format = NumberFormat.getNumberInstance(locale);
        if (format instanceof DecimalFormat) {
            ((DecimalFormat) format).setParseBigDecimal(true);
        }

        return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]", ""));
    }

    public static void main(String[] args) throws ParseException {

        BigDecimal custoCarroNovo, custoAoConsumidor, custoDeFabrica;
        while (true) {
            try {

                custoDeFabrica = new BigDecimal(JOptionPane.showInputDialog(null,
                        "Digite o custo de fábrica:", "Atenção!", 2));

                //c = (custoDeFabrica * IMPOSTOS) * PORCENTAGEM_DISTRIBUIDOR;
                custoCarroNovo = new BigDecimal(IMPOSTOS).multiply(parse(String.valueOf(custoDeFabrica), Locale.ENGLISH))
                        .multiply(new BigDecimal(String.valueOf(PORCENTAGEM_DISTRIBUIDOR)));

                custoAoConsumidor = custoDeFabrica.add(custoCarroNovo);
                
                String str =  String.valueOf(custoAoConsumidor.setScale(2, BigDecimal.ROUND_DOWN));
                
                JOptionPane.showMessageDialog(null, "R$" + str, "Atenção", 1);

            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "R$" + ex.getMessage(), "Atenção", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.",
                        "Atenção", 0);
                System.exit(0);
            }

        }
    }
}
