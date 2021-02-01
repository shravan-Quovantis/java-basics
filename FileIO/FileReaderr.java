package FileIO;

import java.io.IOException;

public class FileReaderr {
    public static void main(final String[] args) throws IOException {
        java.io.FileReader fr = new java.io.FileReader("TestFile.txt");               //Constructor of file Reader
        int i = fr.read();                                              //Reading first character
        while(i != -1){                                                 //-1 representing EOF
            System.out.print((char)i);                                  //Typecasting of int value to char
            i = fr.read();
        }
        fr.close();
    }
}
