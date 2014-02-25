package be.eleonore.wiheries;

import io.aos.console.AosConsole;

public class Suite {

    public static void main(String[] args) {
        
        AosConsole.println("sum =" + sum ( 1, 5, 10 ));
        
    }

    private static int sum ( int u1, int r, int n) {
        
        int total = 0 ;
         int ui = u1 ;
        for (int i = 0 ; i < n ; i++ ) {
            
        total += r ;
        ui += r;
       
      
        }

      
        
        
        
        return total ;
    }
    
    
    
}
