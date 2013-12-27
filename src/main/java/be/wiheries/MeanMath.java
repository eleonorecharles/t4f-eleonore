package be.wiheries;

import io.aos.console.AosConsole;

public class MeanMath {

    public static void main(String[] args) {
        
        Numbers numbers = new Numbers(new Integer[]{13, 4, 5, 1234}) ;
        
        AosConsole.println(numbers.mean());
        
       
    }

}
