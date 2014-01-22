package be.wiheries;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanTest {
    
    @Test
    public void testboolean () {
        assertEquals( true, and(true, true)) ;
        assertEquals( false, and(false, true)) ;
        assertEquals( true, or(true, true)) ;
        assertEquals( false, or(false, false)) ;
    }

    private boolean or(boolean c1 , boolean c2) {
        return ( c1 || c2);
    }

    private Boolean and(boolean b1, boolean b2) {
        return ( b1 && b2 )  ;
    }
    
  
    

}

