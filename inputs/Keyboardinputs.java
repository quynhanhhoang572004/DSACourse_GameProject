package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboardinputs implements KeyListener {
    private GamePanel gamePanel;
    public Keyboardinputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       switch (e.getExtendedKeyCode()){
           case KeyEvent.VK_W:
                gamePanel.changeYDelta(-5);
            break;
           case KeyEvent.VK_A:
               gamePanel.changeYDelta(+5);
            break;
           case KeyEvent.VK_S:
               gamePanel.changeXDelta(-5);
            break;
           case KeyEvent.VK_D:
               gamePanel.changeXDelta(+5);
               break;

       }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
