package be.wiheries;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class DrawingLines extends Applet {
    private static final long serialVersionUID = 1L ;
    
    private int width;
    private int height;
    
    @Override
    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground(Color.PINK);
       
        
    }
    
    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.drawLine(0, 0, width, height);
        for(int i=0; i<10; i++) {
            graphics.drawLine(width, height, i*width / 10, 0);
            
        }
            
        }
    }
    
    
    
    
    


