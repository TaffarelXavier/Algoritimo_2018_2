package algoritimo_2018_2.exercicio_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_3 {

    /**
     *
     * @param txt
     * @return
     */
    public static String stilTexto(String txt) {
        return "<html><body><p style='color:green'>" + txt + "</p></body></html>";
    }

    /**
     *
     * @param txt
     * @return
     */
    public static String[] formatarString(String txt) {
        return txt.split(" ");
    }

    /**
     *
     * @return
     */
    public static long[] getDt() {
        //
        Date date = new Date();
        LocalDate localDate =
                date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long[] dt = {date.getTime(), localDate.getDayOfMonth(),
            localDate.getMonthValue(), localDate.getYear()};
        return dt;
    }

    public static void main(String[] args) {
        getDt();
        int dia, mes, ano;
        DateFormat f = DateFormat.getDateInstance();
        Date data2;

        while (true) {
            try {
                dia = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o DIA do seu nascimento:"));
                while (dia == 0 || dia > 31) {
                    dia = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o DIA, corretamente, do seu nascimento:"));
                }

                mes = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o MÊS do seu nascimento:"));
                while (mes == 0 || mes > 12) {
                    mes = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o MÊS, corretamente, do seu nascimento:"));
                }

                ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o ANO do seu nascimento:"));
                while (ano == 0) {
                    ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o ANO, corretamente, do seu nascimento:"));
                }

                try {
                    data2 = f.parse(dia + "/" + mes + "/" + ano);
                    
                    long[] dt = getDt();
                    
                    int diffInDays = (int) ((dt[0] - data2.getTime()) / (1000 * 60 * 60 * 24));
                    
                    System.out.println(Calendar.YEAR);
                    
                    System.out.println(diffInDays / Calendar.YEAR);
                } catch (ParseException ex) {
                    Logger.getLogger(Questao_3.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (NumberFormatException e) {
                String[] str = formatarString(e.getMessage());
                if (str[0].equalsIgnoreCase("For")) {
                    JOptionPane.showMessageDialog(null,
                            "O valor digitado (" + str[3] + ") é incorreto.", "Atenção", 1);
                }
            }
        }

    }
}
