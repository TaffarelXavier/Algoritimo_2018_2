package algoritimo_2018_2.exercicio_1;

import java.awt.HeadlessException;
import java.util.Arrays;
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
        int n1, n2, n3, n4, aux;

        while (true) {
            try {
//                n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                        "Digite o primeiro número:", "Atenção!", 2));
//
//                n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                        "Digite o segundo número", "Atenção!", 2));
//
//                if (n1 == n2) {
//                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                            "Digite o segundo número", "Atenção!", 2));
//                    if (n1 == n2) {
//                        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                                "Digite o segundo número", "Atenção!", 2));
//                        if (n1 == n2) {
//                            n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                                    "Digite o segundo número", "Atenção!", 2));
//                        }
//                    }
//                }
//
//                n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                        "Digite o terceiro número:", "Atenção!", 2));
//                if (n2 == n3 || n1 == n3) {
//                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                            "Digite o terceiro número", "Atenção!", 2));
//                    if (n2 == n3 || n1 == n3) {
//                        n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                                "Digite o terceiro número", "Atenção!", 2));
//                        if (n2 == n3 || n1 == n3) {
//                            n3 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                                    "Digite o terceiro número", "Atenção!", 2));
//                        }
//                    }
//                }
//
//                n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                        "Digite o quarto número:", "Atenção!", 2));
//                if (n1 == n4 || n2 == n4 || n3 == n4) {
//                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                            "Digite o quarto número", "Atenção!", 2));
//                    if (n1 == n4 || n2 == n4 || n3 == n4) {
//                        n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                                "Digite o quarto número", "Atenção!", 2));
//                        if (n1 == n4 || n2 == n4 || n3 == n4) {
//                            n4 = Integer.parseInt(JOptionPane.showInputDialog(null,
//                                    "Digite o quarto número", "Atenção!", 2));
//                        }
//                    }
//                }

                String str = JOptionPane.showInputDialog(null, "Digite um número", "", 2);
                String[] oStr = str.split("");

                n1 = Integer.parseInt(oStr[0]);
                n2 = Integer.parseInt(oStr[1]);
                n3 = Integer.parseInt(oStr[2]);
                n4 = Integer.parseInt(oStr[3]);

                //Casa do Um
                if (n1 < n2 && n2 < n3 && n3 < n4) { //Um
                    System.out.println("1");
                } else if (n1 < n2 && n2 < n3 && n3 > n4) {
                    System.out.println("2");
                } else if (n1 < n2 && n2 > n3 && n3 < n4) {
                    System.out.println("3");
                } else if (n1 < n2 && n2 < n3 && n3 > n4) {
                    System.out.println("4");
                } else if (n1 < n2 && n2 > n3 && n3 > n4) {
                    System.out.println("5");
                } else if (n1 > n2 && n2 < n3 && n3 < n4) { //2134
                    System.out.println("6");
                } else if (n1 > n2 && n2 < n3 && n3 > n4) { //2143
                    System.out.println("7");
                } else if (n1 < n2 && n2 > n3 && n3 < n4) { //2314
                    System.out.println("8");
                } else if (n1 < n2 && n2 < n3 && n3 > n4) { //2341
                    System.out.println("9");
                } else if (n1 < n2 && n2 > n3 && n3 < n4) { //2413
                    System.out.println("10");
                } else if (n1 < n2 && n2 > n3 && n3 > n4) { //2431
                    System.out.println("11");
                }
                else{
                    System.out.println("AAAAA");
                }

                //Saída:
                /* JOptionPane.showMessageDialog(null,
                        "↓" + n4 + "\n"
                        + "↓" + n3 + "\n"
                        + "↓" + n2 + "\n"
                        + "↓" + n1, "Saída", 1);
                 */
            } catch (HeadlessException | NumberFormatException ex) {
                if (ex.getMessage().equals("null")) {
                    //JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Atenção", 0);
                    System.exit(0);
                }
                JOptionPane.showMessageDialog(null,
                        ex.getMessage(), "Atenção", 1);
            } catch (Exception ex1) {
                System.exit(0);
                //JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Atenção", 0);
            }
        }

    }
}