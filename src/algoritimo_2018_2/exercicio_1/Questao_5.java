package algoritimo_2018_2.exercicio_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Falta implementar as exceções.
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_5 {

    /**
     *
     * @param k
     * @return
     */
    public static int _parseInt(int k) {
        String[] seq = new String[]{"primeiro", "segundo",
            "terceiro", "quarto", "quinto"};
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o " + seq[k].toUpperCase() + " número:"));
    }

    public static void main(String[] args) {

        //Cria um vetor com tamanho 5
        int[] arr = new int[5];

        for (int k = 0; k < 5; k++) {
            arr[k] = _parseInt(k);
        }

        //Ordena o array para colocar o menor
        //no início, e o maior no final.
        Arrays.sort(arr);

        System.out.println("Menor:" + arr[0]);

        //Pega o último elemento, como sorteei o array de forma ascendente,
        //então, o último elemento será o maior.
        System.out.println("Maior:" + arr[arr.length - 1]);
    }
}
