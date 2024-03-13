package main;

import inputs.Keyboardinputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    public GamePanel(){
        mouseInputs = new MouseInputs();
        addKeyListener(new Keyboardinputs());
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);// JComponent is the superclass of Jpanel
        g.fillRect(100,100,200,50);

    }


}
