package infrastructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogWriter {


    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void writeInFile(String string) {
        BufferedWriter bw = null;
        try {

            File file = new File("src/resources/consoleLog");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(string);


        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

}
