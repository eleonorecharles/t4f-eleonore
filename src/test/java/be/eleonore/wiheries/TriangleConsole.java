package be.eleonore.wiheries;

import java.util.Random;

public class TriangleConsole {
    
    private static final int MAX_X =100 ;
    private static final Random random = new Random();
    private static final String MARKER ="£" ;
    
    
    public static void main(String[] args) {
        int x = random.nextInt(MAX_X) ;
        printAscending(x);
        printDescending(x) ;
        
    }
    
    private static void printAscending(int x) {
        for (int i=0; i<x; i++) {
            printLine(i) ;
            
        }
       
    }
    
    private static void printDescending(int x) {
        for (int i=x; i>0; i--) {
            printLine(i) ;
            
        }
        System.out.println();
        

}
    
    private static void printLine(int x) {
        for ( int i=0; i<x ;i ++ ) {
            System.out.print(MARKER) ;
            
        }
        System.out.println();
    }
}
