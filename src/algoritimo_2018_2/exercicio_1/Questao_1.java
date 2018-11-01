/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo_2018_2.exercicio_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_1 {

    public static double[] ordernarArray(double[] array) { //sort in descending order
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    double x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        return array;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double n[] = new double[4];

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, ""));

        }

        ordernarArray(n);
        
        System.out.println(Arrays.toString(n));

    }

}
