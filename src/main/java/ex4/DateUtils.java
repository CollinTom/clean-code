package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * Formate une date selon le motif spécifié.
     *
     * @param pattern Le motif de formatage de la date, par exemple "dd/MM/yyyy HH:mm:ss".
     * @param date La date à formater.
     * @return La date formatée selon le motif spécifié.
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date selon un format par défaut.
     *
     * @param date La date à formater.
     * @return La date formatée selon le format "dd/MM/yyyy HH:mm:ss".
     */
    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
