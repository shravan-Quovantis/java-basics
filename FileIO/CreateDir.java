package FileIO;

import java.io.File;

public class CreateDir {
    public static void main(final String[] args){
        File f = new File("TestDir");
        f.mkdirs();
    }
}
