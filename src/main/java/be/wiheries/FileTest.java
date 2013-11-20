package be.wiheries;

import java.io.File;

import aos.console.AosConsole;

public class FileTest {
    
    public static void main(String[] args) throws Exception {
        
        File desktop = new File("/home/eric/Desktop") ;
        listFiles(desktop) ;
        
        File newFolder = new File ("/home/eric/Desktop/test" ) ;
        newFolder.mkdir();
        listFiles(newFolder) ;
        
        File blablaFile = new File("blablabla") ;
        listFiles(blablaFile) ;
        
        
    }

    
    private static void listFiles(File file) throws Exception {
        AosConsole.println("Listing file :" + file.getCanonicalPath());
        AosConsole.println("-----------------");
        if ( ! file.isDirectory()) {
            throw new Exception ("Sorryyyyyy, the given file must be a folder ! :) ") ;
            
        }
        
        if ( file.listFiles().length == 0) {
            AosConsole.println("........ no file.....") ;
            
        }
        
        else {
            for (File f : file.listFiles()) {
                AosConsole.println(f.getName());
            }
        }
    }
}
