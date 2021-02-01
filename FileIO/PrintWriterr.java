package FileIO;

import java.io.IOException;

//Most used writer over file writer and Buffered writer
public class PrintWriterr {
    public static void main(final String[] args) throws IOException {
        java.io.PrintWriter pw = new java.io.PrintWriter("FileIOPrint.txt");        //Print writer can directly write to the file
        pw.write(113);                                              //writing Q
        pw.print(113);                                              //writing int value 113
        pw.println(true);                                             //writing boolean true
        pw.println('c');                                              //writing character c
        pw.println("Quovantis");                                      //writing String
        pw.flush();
        pw.close();
    }
}
