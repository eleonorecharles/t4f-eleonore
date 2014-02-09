package be.applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AppletImage extends Applet {
    
    public void paint (Graphics g ) {
        
        try {
            Image image = ImageIO.read(AppletImage.class.getResourceAsStream("/vans.jpg")) ;
            g.drawImage(image, 0, 0, this);
            g.drawString("KABOUMMMM", 0, 200 ) ;
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
