package be.wiheries;

import java.util.Random;

import io.aos.console.AosConsole;

public class Mean {

    public static void main(String[] args) {
        
        Random random = new Random();
        int n = random.nextInt(10) ;
        
        int sum = 0 ;
        
        for ( int i=0; i<n ; i++ ) {
            
            int f = random.nextInt(100) ;
            
            AosConsole.println(f);
            
            sum = sum+f ;
         
        }
        
        AosConsole.println("-------------------");
        AosConsole.println("Sum = " +sum);
        AosConsole.println("Mean = " +sum/n);
        
        
              
        


    }

}
