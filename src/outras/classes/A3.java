/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outras.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Fulano
 */
public class A3 {

    public static void main(String[] args) {

        while (true) {
            try {
                String nome;

                double anoatl, anonasc, idade;

                nome = JOptionPane.showInputDialog("Digite o seu nome");

                anonasc = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano que você nasceu"));

                anoatl = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual"));

                idade = anoatl - anonasc;

                if (idade >= 16 && idade > 18) {
                    JOptionPane.showMessageDialog(null, nome + "Está apto(a) a votar e tirar carteira de ablitação");
                }
                else if (idade >= 16 && idade < 18) {
                    JOptionPane.showMessageDialog(null, nome + "Está Apto(a) a vota e não pode tirar a carteiraa de motorista");
                }
                else if (idade < 16 && idade < 18) {
                    JOptionPane.showMessageDialog(null, nome + "Não pode votar e nem tirar a carteira de habilitação");
                }
            } catch (Exception e) {
            }
        }
    }
}
