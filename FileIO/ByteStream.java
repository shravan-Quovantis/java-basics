package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(final String[] args) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try{
            fin = new FileInputStream("input.txt");
            fout = new FileOutputStream(("output.txt"));

            int i;
            while((i = fin.read()) != -1){                  //Doubt: can int type variable hold any type of variable here
                fout.write(i);
            }
        }finally {
            if(fin != null)
                fin.close();
            if(fout != null)
                fout.close();
        }
    }
}
