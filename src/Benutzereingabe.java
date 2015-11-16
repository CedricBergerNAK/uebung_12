import javax.swing.*;

public class Benutzereingabe {

    public static int frageNachIntUeberDialog(String fragesatz) {
        Integer i = null;

        for(i = parseInt(frageNachStringUeberDialog(fragesatz)); i == null; i = parseInt(frageNachStringUeberDialog("Fehler bei der letzten Eingabe\n" + fragesatz))) {
            ;
        }

        return i.intValue();
    }

    private static String frageNachStringUeberDialog(String fragesatz) {
        String eingabe = JOptionPane.showInputDialog(fragesatz);
        if(eingabe == null) {
            System.exit(0);
            return null;
        } else {
            return eingabe;
        }
    }

    private static Integer parseInt(String intValue) {
		if(intValue == null) {
			return null;
		} else {
			try {
				return Integer.valueOf(Integer.parseInt(intValue));
			} catch (NumberFormatException var2) {
				return null;
			}
		}
	}
}
