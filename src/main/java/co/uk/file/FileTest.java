package co.uk.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        
        
       File file = new File ("Eleo") ;
       FileWriter fileWriter = new FileWriter(file) ;
       fileWriter.write("Hello, I'm a perfect student cos I receive PerfectTense,Bye. ") ;
       fileWriter.close();
 
    }

}
