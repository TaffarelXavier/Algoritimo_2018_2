package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_1 {

    /**
     * Eu poderia diminuir este código mais de 80% de linhas.
     *
     * @param args
     */
    public static void main(String[] args) {

        //Declaração das variáveis:
        int n1, n2, n3, n4;
        String saida = "";
        while (true) {
            
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o primeiro número:", "Atenção!", 2));

                n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o segundo número", "Atenção!", 2));

                if (n1 == n2) {
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o segundo número", "Atenção!", 2));
                    if (n1 == n2) {
                        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite o segundo número", "Atenção!", 2));
                        if (n1 == n2) {
                            n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite o segundo número", "Atenção!", 2));
                        }
                    }
                }

                n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o terceiro número:", "Atenção!", 2));
                if (n2 == n3 || n1 == n3) {
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o terceiro número", "Atenção!", 2));
                    if (n2 == n3 || n1 == n3) {
                        n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite o terceiro número", "Atenção!", 2));
                        if (n2 == n3 || n1 == n3) {
                            n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite o terceiro número", "Atenção!", 2));
                        }
                    }
                }

                n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o quarto número:", "Atenção!", 2));
                if (n1 == n4 || n2 == n4 || n3 == n4) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o quarto número", "Atenção!", 2));
                    if (n1 == n4 || n2 == n4 || n3 == n4) {
                        n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite o quarto número", "Atenção!", 2));
                        if (n1 == n4 || n2 == n4 || n3 == n4) {
                            n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite o quarto número", "Atenção!", 2));
                        }
                    }
                }

                if (n1 != n2 && n2 != n3 && n3 != n4 && n1 != n3 && n1 != n4) {
                    if (n1 < n2 && n2 < n3 && n3 < n4) { //1234
                        saida = ("↓" + n4 + "\n↓" + n3 + "\n↓" + n2 + "\n↓" + n1);
                    } else if (n1 < n2 && n2 < n3 && n3 > n4 && n2 < n4) { //1243
                        saida = ("↓" + n3 + "\n↓" + n4 + "\n↓" + n2 + "\n↓" + n1);
                    } else if (n1 < n2 && n2 > n3 && n3 < n4 && n2 < n4 && n1 < n3) { //1324
                        saida = ("↓" + n4 + "\n↓" + n2 + "\n↓" + n3 + "\n↓" + n1); //2314
                    } else if (n1 < n2 && n2 < n3 && n3 > n4 && n2 > n4 && n1 < n3 && n1 < n4) { //1342-2341
                        saida = ("↓" + n3 + "\n↓" + n2 + "\n↓" + n4 + "\n↓" + n1);
                    } else if (n1 < n2 && n1 < n3 && n1 < n4 && n2 > n3 && n2 > n4 && n1 < n3) { //1423-2413
                        saida = ("↓" + n2 + "\n↓" + n4 + "\n↓" + n3 + "\n↓" + n1);//1423
                    } else if (n1 < n2 && n2 > n3 && n3 > n4 && n2 > n4 && n1 < n3 && n1 < n4) { //1432
                        saida = ("↓" + n2 + "\n↓" + n3 + "\n↓" + n4 + "\n↓" + n1);//1423
                    } else if (n1 > n2 && n2 < n3 && n3 < n4 && n2 < n4 && n1 < n3 && n1 < n4) { //2134
                        saida = ("↓" + n4 + "\n↓" + n3 + "\n↓" + n1 + "\n↓" + n2);//
                    } else if (n1 > n2 && n2 < n3 && n3 > n4 && n2 < n4 && n1 < n3 && n1 < n4) { //2143
                        saida = ("↓" + n3 + "\n↓" + n4 + "\n↓" + n1 + "\n↓" + n2);//
                    } else if (n1 < n2 && n2 > n3 && n3 < n4 && n1 > n3 && n1 < n4 && n2 < n4) { //2314-2413
                        saida = ("↓" + n4 + "\n↓" + n2 + "\n↓" + n1 + "\n↓" + n3);//
                    } else if (n1 < n2 && n2 < n3 && n3 > n4 && n2 > n4 && n1 < n3 && n1 > n4) { //2341
                        saida = ("↓" + n3 + "\n↓" + n2 + "\n↓" + n1 + "\n↓" + n4);//
                    } else if (n1 < n2 && n1 > n3 && n1 < n4 && n2 > n3 && n1 < n4 && n2 > n4) { //2413
                        saida = ("↓" + n2 + "\n↓" + n4 + "\n↓" + n1 + "\n↓" + n3);//
                    } else if (n1 < n2 && n2 > n3 && n3 > n4 && n2 > n4 && n1 < n3 && n1 > n4) { //2431
                        saida = ("↓" + n2 + "\n↓" + n3 + "\n↓" + n1 + "\n↓" + n4);//
                    } else if (n1 > n2 && n1 > n3 && n1 < n4 && n2 < n3 && n2 < n4 && n3 < n4) {//3124
                        saida = ("↓" + n4 + "\n↓" + n1 + "\n↓" + n3 + "\n↓" + n2);//
                    } else if (n1 > n2 && n1 < n3 && n1 > n4 && n2 < n3 && n2 < n4 && n3 > n4) { //3142
                        saida = ("↓" + n3 + "\n↓" + n1 + "\n↓" + n4 + "\n↓" + n2);//
                    } else if (n1 > n2 && n1 > n3 && n1 < n4 && n2 > n3 && n2 < n4 && n3 < n4) { //3214
                        saida = ("↓" + n4 + "\n↓" + n1 + "\n↓" + n2 + "\n↓" + n3);// 
                    } else if (n1 > n2 && n1 < n3 && n1 > n4 && n2 < n3 && n2 > n4 && n3 > n4) { //3241
                        saida = ("↓" + n3 + "\n↓" + n1 + "\n↓" + n2 + "\n↓" + n4);// 
                    } else if (n1 < n2 && n1 > n3 && n1 > n4 && n2 > n3 && n2 > n4 && n3 < n4) { //3412
                        saida = ("↓" + n2 + "\n↓" + n1 + "\n↓" + n4 + "\n↓" + n3);//
                    } else if (n1 < n2 && n1 > n3 && n1 > n4 && n2 > n3 && n2 > n4 && n3 > n4) { //3421
                        saida = ("↓" + n2 + "\n↓" + n1 + "\n↓" + n3 + "\n↓" + n4);//
                    } else if (n1 > n2 && n1 > n3 && n1 > n4 && n2 < n3 && n2 < n4 && n3 < n4) { //4123
                        saida = ("↓" + n1 + "\n↓" + n4 + "\n↓" + n3 + "\n↓" + n2);//
                    } else if (n1 > n2 && n1 > n3 && n1 > n4 && n2 < n3 && n2 < n4 && n3 > n4) { //4132
                        saida = ("↓" + n1 + "\n↓" + n3 + "\n↓" + n4 + "\n↓" + n2);// 
                    } else if (n1 > n2 && n1 > n3 && n1 > n4 && n2 > n3 && n2 < n4 && n3 < n4) { //4213-
                        saida = ("↓" + n1 + "\n↓" + n4 + "\n↓" + n2 + "\n↓" + n3);//
                    } else if (n1 > n2 && n1 > n3 && n1 > n4 && n2 < n3 && n2 > n4 && n3 > n4) { //4231-
                        saida = ("↓" + n1 + "\n↓" + n3 + "\n↓" + n2 + "\n↓" + n4);//
                    } else if (n1 > n2 && n1 > n3 && n1 > n4 && n2 > n3 && n2 > n4 && n3 < n4) { //4312-
                        saida = ("↓" + n1 + "\n↓" + n2 + "\n↓" + n4 + "\n↓" + n3);//
                    } else if (n1 > n2 && n1 > n3 && n1 > n4 && n2 > n3 && n2 > n4 && n3 > n4) { //4321-
                        saida = ("↓" + n1 + "\n↓" + n2 + "\n↓" + n3 + "\n↓" + n4);//
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, caro usuário, digite somente números diferentes.", "Atenção", 1);
                }

                //Saída:
                JOptionPane.showMessageDialog(null, "A ordem decrescente é:\n\t" + saida, "Saída", 1);

            } catch (HeadlessException | NumberFormatException ex) {
                if (ex.getMessage().equals("null")) {
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Atenção", 0);
                    System.exit(0);
                }
                System.exit(0);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", 1);
            } catch (Exception ex1) {
                System.exit(0);
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Atenção", 0);
            }
        }

    }
}
