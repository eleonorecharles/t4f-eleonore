package be.wiheries;

import aos.console.AosConsole;

public class Suite {

    public static void main(String[] args) {
       
        Integer value = 0 ;
        Integer reason = 5 ;
         for (int i = 0; i <20 ; i ++ ) {
            AosConsole.println(value);
            value += reason;
            
        }
       
    }

}
