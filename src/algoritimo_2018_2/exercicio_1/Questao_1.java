package algoritimo_2018_2.exercicio_1;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_1 {

    public static int[] ordernarArray(int[] array) { //sort in descending order

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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n[] = new int[4];

        for (int i = 0; i < n.length; i++) {

            while (n[i] == 0 || n[i] < 0) {
                try {
                    n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:" + (i + 1)));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Insira um valor correto para o número: "  + (i + 1));
                }
            }
        }

        ordernarArray(n);

        System.out.println(Arrays.toString(n));

    }

}
