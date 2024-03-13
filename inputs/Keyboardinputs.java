package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboardinputs implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       switch (e.getExtendedKeyCode()){
           case KeyEvent.VK_W:
                System.out.println("It's W");
            break;
           case KeyEvent.VK_A:
               System.out.println("It's A");
            break;
           case KeyEvent.VK_S:
                System.out.println("It's S");
            break;
           case KeyEvent.VK_D:
               System.out.println("It's D");
               break;

       }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
