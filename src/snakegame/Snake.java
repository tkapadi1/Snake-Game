package snakegame;

import javax.swing.JFrame;

/**
 *
 * @author kappa
 */
public class Snake extends JFrame{
    Snake(){
        super("Snake Game");
        add(new Board());
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args){
        new Snake().setVisible(true);
    }
}
