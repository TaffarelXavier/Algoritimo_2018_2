/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_7 {

    public static void main(String[] args) {
        String a, b, c, d;

        a = JOptionPane.showInputDialog(null, "Digite algum valoar para variável A");
        c = a;
        b = JOptionPane.showInputDialog(null, "Digite algum valoar para variável B");
        d = b;
        
        a = d;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
