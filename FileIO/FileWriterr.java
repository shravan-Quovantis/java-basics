package FileIO;

import java.io.IOException;

public class FileWriterr {
    public static void main(final String[] args) throws IOException {
        java.io.FileWriter fw = new java.io.FileWriter("TestFile.txt", true);         //True parameter is used to indicate append operation
        fw.write('\n');
        fw.write("83");                                                    //Adding a single character S
        fw.write("oftware\nEngineer");
        fw.write('\n');
        char[] ch = {'H', 'i'};
        fw.write(ch);
        fw.flush();                                                         //Assures write up operation done properly
        fw.close();                                                         //close writer
    }
}
