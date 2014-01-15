import org.junit.Test;


public class ParamTest {
    
    @Test
    public void testParam () {
        say ("hello") ;
        say ("zgfuagf") ;
        
    }

    @Test
    public void testSum() {
        int y = 3 ;
        int u = 54 ;
        int r = sum( 3 , 54 ) ;
        System.out.println( y + "+ " + u + " =" + r);
    }

    @Test
    public void testDiv () {
        int y = 4 ;
        int u = 34 ;
        int r = div( 4 , 34 ) ;
        System.out.println( y + "/ " + u + " =" + r);
    }
    
    private void say(String message) {
        System.out.println (message) ;
        
    }
    
    private int sum( int x, int y) {
        return x + y;
        
    }
    private int div( int x, int y) {
        if (y == 0) { 
            throw new IllegalArgumentException();
        }
        return x / y ;
    }

}
