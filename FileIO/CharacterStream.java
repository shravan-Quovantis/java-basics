package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class CharacterStream {
    public static void main(final String[] args) throws IOException {
        FileReader fin = null; //use relatable name
        FileWriter fout = null;

        try {
            fin = new FileReader("input1.txt");
            fout = new FileWriter("output1.txt");

            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
                System.out.print((char) i);
            }
        } finally {

            if (Objects.nonNull(fin))
                fin.close();
            if (Objects.nonNull(fout))
                fout.close();
        }
    }
}