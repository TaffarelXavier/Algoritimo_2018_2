/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outras.classes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class SortArrays {
       public static int[] ordernarArrayDesc(int[] array) { //Ordena de forma descendente

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        return array;
    }

    public static void methodo() {

        int n[] = new int[4];

        String r[] = new String[4];

        for (int i = 0; i < n.length; i++) {

            while (n[i] == 0 || n[i] < 0) {

                try {
                    r[i] = String.valueOf(n[1]);

                    n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:" + (i + 1)));

                    ordernarArrayDesc(n);

                    for (String r1 : r) {
                        while (String.valueOf(n[i]).equals(r1)) {
                            JOptionPane.showMessageDialog(null, "O número digitado já existe.", "Atenção", 1);
                            n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:" + (i + 1)));
                        }
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Insira um valor correto para o número: " + (i + 1));
                }
            }
        }

        ordernarArrayDesc(n);

        JOptionPane.showMessageDialog(null, Arrays.toString(n), "Atenção", 1);

    }

}
