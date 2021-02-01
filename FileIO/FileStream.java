package FileIO;

import java.io.*;

public class FileStream {
    public static void main(final String[] args){
        try{
            byte[] bWriter = {10, 12, 13, 56};
            FileOutputStream outStrm = new FileOutputStream("test.txt");
            for(int x=0; x<bWriter.length; x++)
                outStrm.write(bWriter[x]);

            outStrm.close();

            InputStream inStrm = new FileInputStream("test.txt");
            int Size = inStrm.available();
            for(int x=0; x< Size; x++){
                System.out.print((char)inStrm.read()+" ");
            }
            inStrm.close();

        }catch(IOException e){
            System.out.print("Exception");
        }
    }
}
