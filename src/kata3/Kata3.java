package kata3;

import java.io.FileNotFoundException;
import kata3.control.HistogramControl;
import kata3.persistence.MailReader;

public class Kata3 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 1};
        HistogramControl<Integer> integerControl = new HistogramControl();
        integerControl.execute(array);
        
        HistogramControl<String> mailControl = new HistogramControl();
        mailControl.execute(getMails("C:\\Users\\usuario\\Documents\\NetBeansProjects\\kata3\\mails.txt"));
    }
    
    public static String[] getMails (String filename) {
        MailReader reader = new MailReader();
        try {
            return reader.read(filename);
        } catch (FileNotFoundException ex) {
            return new String[0];
        }
    }
    
   
}
