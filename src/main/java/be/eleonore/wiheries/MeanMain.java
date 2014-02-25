package be.eleonore.wiheries;

import io.aos.console.AosConsole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeanMain {

    public static void main(String[] args) {
        int i = 1 ;
        List<Integer> ints = new ArrayList<Integer>();
        while (i != 0) {
            i = AosConsole.readInt("Next Integer ???? ") ;
            ints.add(i) ;
        }
        AosConsole.println( "Mean of " + ints + "= " + mean(ints));
        Collections.sort(ints);
        AosConsole.println("List sorted =" + ints );

  }
    
    private static float mean (List<Integer> ints) {
    int sum=0;
    for ( int i : ints ) {
    sum =+ i ;
    }
    
    return ((float) sum / (float) ints.size()) ;
    
    }
 }
