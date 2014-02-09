package be.review;

import io.aos.console.AosConsole;

public class Loop {

    public static void main(String[] args) {
       
        for ( Integer i = 0 ; i<10 ; i ++ ) {
            
            AosConsole.println( "Multiplication by " + i );
            
            for ( Integer j = 0 ; j<10 ; j++ ){
                
                AosConsole.println(i + "*" + j + "=" + i*j );
                
            }
            
            
            AosConsole.println("--------------------");
            
               
            
            
        }

    }

}
