package FileIO;

import java.io.File;

public class ListDir {
    public static void main(final String[] args){
        File f = null;
        String[] path;

        try{
            f = new File("/home/shravan.kumar/IdeaProjects");
            path = f.list();

            for(String s : path){
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
