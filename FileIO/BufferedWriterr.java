package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterr {
    public static void main(final String[] args) throws IOException {
        FileWriter fw = new FileWriter("TestFile.txt");
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        bw.write(113);
        bw.write("uovantis \nTechnologies");
        bw.newLine();
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        bw.write(ch);
        bw.newLine();
        bw.write("End");
        bw.flush();
        bw.close();                                                 //if we close Buffered writer File writer will be
                                                                    // automatically close
    }
}
