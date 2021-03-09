package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author kappa
 */
public class Board extends JPanel{
    
    private Image apple;
    private Image dot;
    private Image head;
    
    
    Board(){
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300,300));
        
        loadImage();
    }

    public void loadImage() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("snakegame/images/apple.png"));
        apple = i1.getImage();
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("snakegame/images/dot.png"));
        dot = i2.getImage();
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("snakegame/images/head.png"));
        head = i3.getImage();
    }
}
