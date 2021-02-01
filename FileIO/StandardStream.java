package FileIO;

import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStream {
    public static void main(final String[] args) throws IOException {
        InputStreamReader in = null;

        try{
            in = new InputStreamReader(System.in);
            System.out.println("Enter Characters and q to quit.");
            char i;
            do{
                i = (char) in.read();
            }while(i != 'q');
        }finally{
            if(in != null)
                in.close();
        }
    }
}
