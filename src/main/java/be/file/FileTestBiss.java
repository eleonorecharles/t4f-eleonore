package be.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import io.aos.console.AosConsole;

public class FileTestBiss {

    public static void main(String[] args) throws IOException {
       
        
        File file = new File ("FileTest.txt") ;
        
        FileWriter fw = new FileWriter (file) ;
        
        fw.write("Eleo blablablah") ;
        fw.close();
        
        AosConsole.println("file is written to" + file.getAbsolutePath());
        
        
        
        

    }

}
