package be.wiheries;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class RandomLines extends Frame {
    
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static Random random = new Random() ;
    
    private int x1 = 0;
    private int y1 = 0;

    private int x2 = WIDTH/2;
    private int y2 = HEIGHT/2;
   
    public static void main(String[] args) {
        RandomLines randomLines = new RandomLines();
        randomLines.setSize(new Dimension(WIDTH, HEIGHT)) ;
        randomLines.setBackground(Color.RED);
        randomLines.setVisible(true) ;
      
    }
    
    public void paint (Graphics graphics) {
        for ( int i=0; i<3 ; i ++ ) {
            nextPoint() ;
            System.out.println(i);
            graphics.drawLine(x1, y1, x2, y2);
            
        }
    }

    private void nextPoint() {
        x1 = x2 ;
        y1 = y2 ;
        x2 = random.nextInt(WIDTH) ;
        y2 = random.nextInt(HEIGHT);
        
    }
}
