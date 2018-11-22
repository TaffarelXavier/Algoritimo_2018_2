/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class AtividadeCores {

    public static void main(String[] args) {
        //Declaração das variáveis:
        //Fala e responde
        String quemFala, quemResponde;
        try {
            while (true) {
                //Entradas
                quemFala = JOptionPane.showInputDialog(null, "Digite:\nRosa\nBranca\nOu Violeta para quem disse.");

                if (!quemFala.equalsIgnoreCase("rosa") && !quemFala.equalsIgnoreCase("branca") && !quemFala.equalsIgnoreCase("violeta")) {
                    JOptionPane.showMessageDialog(null, "Digite alguma das palavras: Rosa, Branca ou Violeta.", "Atenção", 1);
                } else {
                    quemResponde = JOptionPane.showInputDialog(null, "Digite quem responde.");

                    if (quemFala.equalsIgnoreCase(quemResponde)) {
                        JOptionPane.showMessageDialog(null, "Quem fala deve ser diferente de quem responde.", "Atenção", 1);
                    } else {
                        if (quemFala.equalsIgnoreCase("rosa") && quemResponde.equalsIgnoreCase("violeta")) {
                            JOptionPane.showMessageDialog(null,
                                    "A dona Rosa disse e a senhora de vestido violeta respondeu, portanto:\n"
                                    + "Dona Rosa usa branco\n"
                                    + "Dona Violeta usa rosa\n"
                                    + "Dona Branca usa violeta");
                        } else if (quemFala.equalsIgnoreCase("rosa") && quemResponde.equalsIgnoreCase("branca")) {
                            JOptionPane.showMessageDialog(null,
                                    "A dona Rosa disse e a senhora de vestido branco respondeu, portanto:\n"
                                    + "Dona Rosa usa violeta\n"
                                    + "Dona Violeta usa branca\n"
                                    + "Dona Branca usa violeta");
                        } else if (quemFala.equalsIgnoreCase("branca") && quemResponde.equalsIgnoreCase("rosa")) {
                            JOptionPane.showMessageDialog(null,
                                    "A dona Branca disse e a senhora de vestido rosa respondeu, portanto:\n"
                                    + "Dona Branca usa violeta\n"
                                    + "Dona Violeta usa rosa\n"
                                    + "Dona Rosa usa branca");
                        } else if (quemFala.equalsIgnoreCase("branca") && quemResponde.equalsIgnoreCase("violeta")) {
                            JOptionPane.showMessageDialog(null,
                                    "A dona Branca disse e a senhora de vestido Violeta respondeu, portanto:\n"
                                    + "Dona Branca usa rosa\n"
                                    + "Dona Violeta usa branca\n"
                                    + "Dona Rosa usa violeta");
                        } else if (quemFala.equalsIgnoreCase("violeta") && quemResponde.equalsIgnoreCase("rosa")) {
                            JOptionPane.showMessageDialog(null,
                                    "A dona Violeta disse e a senhora de vestido Rosa respondeu, portanto:\n"
                                    + "DonaVioleta usa rosa\n"
                                    + "Dona Rosa Violeta usa branca\n"
                                    + "DonaBranca Rosa usa violeta");
                        } else if (quemFala.equalsIgnoreCase("violeta") && quemResponde.equalsIgnoreCase("branca")) {
                            JOptionPane.showMessageDialog(null,
                                    "A dona Violeta disse e a senhora de vestido branco respondeu, portanto:\n"
                                    + "Dona Violeta usa rosa\n"
                                    + "DonaRosa usa branca\n"
                                    + "Dona Branca Rosa usa violeta");
                        }
                    }

                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atenção", 1);
            System.exit(0);
        }
    }
}
