package FileIO;

import java.io.FileReader;
import java.io.IOException;

//Most used Reader over File Reader and Print Reader
public class BufferedReaderr {
    public static void main(final String[] args) throws IOException {
        FileReader fr = new FileReader("TestFile.txt");            //Buffered reader can't read file directly but
        java.io.BufferedReader br = new java.io.BufferedReader(fr);                  // can read via file reader
        String line = br.readLine();                                 //reading first line
        while (line != null) {                                       //'null' representing EOF
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
